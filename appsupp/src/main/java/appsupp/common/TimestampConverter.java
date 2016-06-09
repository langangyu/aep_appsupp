package appsupp.common;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import aenvsrd.util.DateUtil;


@Component
public class TimestampConverter implements Converter {

	// Actions
	// ------------------------------------------------------------------------------------

	@Transactional
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		Object obj = null;
		try {
			Date date = DateUtil.parseDate(value, DateUtil.DATE_FORMAT_YYYY_MM_DD);
			if (date != null) {
				obj = new Timestamp(date.getTime());
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return obj;
	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		String returnString = null;
		if (value != null)
			returnString = DateUtil.formatDate((Timestamp) value);

		return returnString;
	}
}
