package appsupp.module;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataItem implements java.io.Serializable {

	private static final long serialVersionUID = -87116268751536996L;
	private Integer dataItemId;

	private String label;
	private DomainCode field;
	private DomainCode domainCodeValue;
	private String stringValue;
	private Timestamp timestampValue;
	private Boolean booleanValue;
	private Map<String, DataItem> subAppSuppData = new HashMap<String,DataItem>();
	private String others;

	private boolean isOtherSelected;
	private String description;
	private List<DomainCode> listOfValues = new ArrayList<DomainCode>();
	private String[] selectedCheckboxes = new String[0];

	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;

	public DataItem() {

	}

	public DataItem(String stringValue) {
		this.setStringValue(stringValue);
	}

	public DataItem(Timestamp datetime) {
		this.setTimestampValue(datetime);
	}

	public DataItem(Timestamp currentTimestamp, String defaultUser) {
		this.createTimestamp = currentTimestamp;
		this.createUserid = defaultUser;
	}

	public String getCreateUserid() {
		return createUserid;
	}

	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getUpdateUserid() {
		return updateUserid;
	}

	public void setUpdateUserid(String updateUserid) {
		this.updateUserid = updateUserid;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public DomainCode getDomainCodeValue() {
		return domainCodeValue;
	}

	public void setDomainCodeValue(DomainCode domainCodeValue) {
		this.domainCodeValue = domainCodeValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Boolean getBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(Boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isOtherSelected() {
		return isOtherSelected;
	}

	public void setOtherSelected(boolean isOtherSelected) {
		this.isOtherSelected = isOtherSelected;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<DomainCode> getListOfValues() {
		return listOfValues;
	}

	public void setListOfValues(List<DomainCode> listOfValues) {
		this.listOfValues = listOfValues;
	}

	public String[] getSelectedCheckboxes() {
		return selectedCheckboxes;
	}

	public void setSelectedCheckboxes(String[] selectedCheckboxes) {
		this.selectedCheckboxes = selectedCheckboxes;
	}

	public Timestamp getTimestampValue() {
		return timestampValue;
	}

	public void setTimestampValue(Timestamp timestampValue) {
		this.timestampValue = timestampValue;
	}

	public DomainCode getField() {
		return field;
	}

	public void setField(DomainCode field) {
		this.field = field;
	}

	public Map<String, DataItem> getSubAppSuppData() {
		return subAppSuppData;
	}

	public void setSubAppSuppData(Map<String, DataItem> subAppSuppData) {
		this.subAppSuppData = subAppSuppData;
	}

	public Integer getDataItemId() {
		return dataItemId;
	}

	public void setDataItemId(Integer dataItemId) {
		this.dataItemId = dataItemId;
	}


}
