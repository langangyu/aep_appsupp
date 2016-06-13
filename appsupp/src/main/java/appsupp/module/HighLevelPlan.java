package appsupp.module;

import java.sql.Timestamp;
import java.util.Map;

public class HighLevelPlan extends AbstractTimestamp implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6695349863456927137L;
	private Integer hlpId;
	private ApplicationSupplement applicationSupplement;

	private int rowNumber;
	private Map<String, DataItem> fields;

	private static final String NAME = "HighLevelPlan.name";
	private static final String DIRECTION = "HighLevelPlan.direction";
	private static final String CONTRACT_SIGNED_DATE = "HighLevelPlan.contractSignedDate";

	public HighLevelPlan() {
	}

	public HighLevelPlan(Timestamp createTimestamp2, String createUserid) {
		this.setCreateTimestamp(createTimestamp2);
		this.setCreateUserid(createUserid);
	}

	public Integer getHlpId() {
		return hlpId;
	}

	public void setHlpId(Integer hlpId) {
		this.hlpId = hlpId;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public Map<String, DataItem> getFields() {
		return fields;
	}

	public void setFields(Map<String, DataItem> fields) {
		this.fields = fields;
	}

	public ApplicationSupplement getApplicationSupplement() {
		return applicationSupplement;
	}

	public void setApplicationSupplement(ApplicationSupplement applicationSupplement) {
		this.applicationSupplement = applicationSupplement;
	}

	public String getName() {
		return this.getFields().get(Messages.getString(NAME)).getStringValue();
	}

	public void setName(String name) {
		this.getFields().get(Messages.getString(NAME)).setStringValue(name);
	}

	public String getDirection() {
		return this.getFields().get(Messages.getString(DIRECTION)).getStringValue();
	}

	public void setDirection(String direction) {
		this.getFields().get(Messages.getString(DIRECTION)).setStringValue(direction);
	}

	public Timestamp getContractSignedDate() {
		return this.getFields().get(Messages.getString(CONTRACT_SIGNED_DATE)).getTimestampValue();
	}

	public void setContractSignedDate(Timestamp contractSignedDate) {
		this.getFields().get(Messages.getString(NAME)).setTimestampValue(contractSignedDate);
	}

}
