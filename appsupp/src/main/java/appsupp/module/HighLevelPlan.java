package appsupp.module;

import java.sql.Timestamp;
import java.util.Map;

public class HighLevelPlan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6695349863456927137L;
	private Integer hlpId;
	private AccessClass accessClass;
	private AppSuppData name;
	private AppSuppData direction;
	private AppSuppData contractSignedDate;
	private int rowNumber;
	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;
	private Map<String, AppSuppData> fields;

	public HighLevelPlan() {

	}

	public HighLevelPlan(Timestamp createTimestamp2, String createUserid) {
		this.createTimestamp = createTimestamp2;
		this.createUserid = createUserid;
	}

	public AppSuppData getName() {
		return name;
	}

	public void setName(AppSuppData name) {
		this.name = name;
	}

	public AppSuppData getDirection() {
		return direction;
	}

	public void setDirection(AppSuppData direction) {
		this.direction = direction;
	}

	public AppSuppData getContractSignedDate() {
		return contractSignedDate;
	}

	public void setContractSignedDate(AppSuppData contractSignedDate) {
		this.contractSignedDate = contractSignedDate;
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

	public AccessClass getAccessClass() {
		return accessClass;
	}

	public void setAccessClass(AccessClass accessClass) {
		this.accessClass = accessClass;
	}

	public Map<String, AppSuppData> getFields() {
		return fields;
	}

	public void setFields(Map<String, AppSuppData> fields) {
		this.fields = fields;
	}
}
