package appsupp.module;

import java.sql.Timestamp;
import java.util.Date;

public class WatercourseCrossing implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private String crossingNumber;
	private DomainCode initialCrossingMethod;
	private DomainCode finalCrossingMethod;
	private DomainCode culvertBridgeSize;
	private DomainCode waterCourseSizeClass;
	private String latitude;
	private String longitude;
	private String diameterWidth;
	private String length;
	private Date restrictedActivityFromDate;
	private Date restrictedActivityToDate;
	private DomainCode waterbodyClass;
	private int rowNumber;
	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;
	
	public String getCrossingNumber() {
		return crossingNumber;
	}

	public void setCrossingNumber(String crossingNumber) {
		this.crossingNumber = crossingNumber;
	}

	public DomainCode getInitialCrossingMethod() {
		return initialCrossingMethod;
	}

	public void setInitialCrossingMethod(DomainCode initialCrossingMethod) {
		this.initialCrossingMethod = initialCrossingMethod;
	}

	public DomainCode getFinalCrossingMethod() {
		return finalCrossingMethod;
	}

	public void setFinalCrossingMethod(DomainCode finalCrossingMethod) {
		this.finalCrossingMethod = finalCrossingMethod;
	}

	public DomainCode getCulvertBridgeSize() {
		return culvertBridgeSize;
	}

	public void setCulvertBridgeSize(DomainCode culvertBridgeSize) {
		this.culvertBridgeSize = culvertBridgeSize;
	}

	public DomainCode getWaterCourseSizeClass() {
		return waterCourseSizeClass;
	}

	public void setWaterCourseSizeClass(DomainCode waterCourseSizeClass) {
		this.waterCourseSizeClass = waterCourseSizeClass;
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

	public String getDiameterWidth() {
		return diameterWidth;
	}

	public void setDiameterWidth(String diameterWidth) {
		this.diameterWidth = diameterWidth;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public Date getRestrictedActivityFromDate() {
		return restrictedActivityFromDate;
	}

	public void setRestrictedActivityFromDate(Date restrictedActivityFromDate) {
		this.restrictedActivityFromDate = restrictedActivityFromDate;
	}

	public Date getRestrictedActivityToDate() {
		return restrictedActivityToDate;
	}

	public void setRestrictedActivityToDate(Date restrictedActivityToDate) {
		this.restrictedActivityToDate = restrictedActivityToDate;
	}

	public DomainCode getWaterbodyClass() {
		return waterbodyClass;
	}

	public void setWaterbodyClass(DomainCode waterbodyClass) {
		this.waterbodyClass = waterbodyClass;
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