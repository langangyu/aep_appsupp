package appsupp.common;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import appsupp.dao.DomainCodesDao;
import appsupp.module.DomainCode;

@Component
public class SpringDomainCodeConverter implements Converter {

	@Autowired
	@Qualifier(value = "domainCodesDao")
	private DomainCodesDao dao;

	// Actions
	// ------------------------------------------------------------------------------------

	public DomainCodesDao getDao() {
		return dao;
	}

	public void setDao(DomainCodesDao dao) {
		this.dao = dao;
	}

	@Transactional
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {

		Object obj = null;
		if (Integer.valueOf(value) > 0) {
			obj = (Object) dao.getDomainCode(Integer.valueOf(value));

		} else
			obj = (Object) new DomainCode(0, "", "");

		return obj;

	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		String returnString = null;
		if (value != null)
			returnString = ((DomainCode) value).getDomainCodeId().toString();

		return returnString;
	}
}
