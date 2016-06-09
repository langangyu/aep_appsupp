package appsupp.module;

import java.sql.Timestamp;

public class IncidentalActivity implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private DomainCode purposeActivityType;
	private String latitude;
	private String longitude;
	private String area;
	private String meetsProxReqs; // Y / N / N/A
	private String adjoiningDisposition; // Y / N / N/A
	private DomainCode activityStatus; // or string?
	private int rowNumber;
	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;

	public IncidentalActivity() {
		
	}
	
	public DomainCode getPurposeActivityType() {
		return purposeActivityType;
	}

	public void setPurposeActivityType(DomainCode purposeActivityType) {
		this.purposeActivityType = purposeActivityType;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMeetsProxReqs() {
		return meetsProxReqs;
	}

	public void setMeetsProxReqs(String meetsProxReqs) {
		this.meetsProxReqs = meetsProxReqs;
	}

	public String getAdjoiningDisposition() {
		return adjoiningDisposition;
	}

	public void setAdjoiningDisposition(String adjoiningDisposition) {
		this.adjoiningDisposition = adjoiningDisposition;
	}

	public DomainCode getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(DomainCode activityStatus) {
		this.activityStatus = activityStatus;
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
}