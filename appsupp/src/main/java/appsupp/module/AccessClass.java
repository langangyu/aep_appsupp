package appsupp.module;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AccessClass implements java.io.Serializable

{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1320446836437411707L;
	private Integer accessClassId;
	private ApplicationSupplement appSupp;

	// Access - Section A
	private AppSuppData domainCodeRoadClass;
	private AppSuppData variableConstructionTechniques;
	private AppSuppData processFollowed;
	private AppSuppData accessControlsRequired;

	private List<HighLevelPlan> highLevelPlans = new ArrayList<HighLevelPlan>();

	private AppSuppData accessControlPreexistingAccess;
	private AppSuppData accessControlOther;
	private AppSuppData preaccessControlExistingLegalLocation;
	private AppSuppData accessControlsOtherDescription;
	private AppSuppData accessControlsAdditionalInfo;

	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;

	public AccessClass() {
	}

	public AccessClass(Timestamp currentTimestamp, String defaultUser) {
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

	public Integer getAccessClassId() {
		return accessClassId;
	}

	public void setAccessClassId(Integer accessClassId) {
		this.accessClassId = accessClassId;
	}

	public ApplicationSupplement getAppSupp() {
		return appSupp;
	}

	public void setAppSupp(ApplicationSupplement appSupp) {
		this.appSupp = appSupp;
	}

	public AppSuppData getDomainCodeRoadClass() {
		return domainCodeRoadClass;
	}

	public void setDomainCodeRoadClass(AppSuppData domainCodeRoadClass) {
		this.domainCodeRoadClass = domainCodeRoadClass;
	}

	public AppSuppData getVariableConstructionTechniques() {
		return variableConstructionTechniques;
	}

	public void setVariableConstructionTechniques(AppSuppData variableConstructionTechniques) {
		this.variableConstructionTechniques = variableConstructionTechniques;
	}

	public AppSuppData getProcessFollowed() {
		return processFollowed;
	}

	public void setProcessFollowed(AppSuppData processFollowed) {
		this.processFollowed = processFollowed;
	}

	public AppSuppData getAccessControlsRequired() {
		return accessControlsRequired;
	}

	public void setAccessControlsRequired(AppSuppData accessControlsRequired) {
		this.accessControlsRequired = accessControlsRequired;
	}

	public AppSuppData getAccessControlPreexistingAccess() {
		return accessControlPreexistingAccess;
	}

	public void setAccessControlPreexistingAccess(AppSuppData accessControlPreexistingAccess) {
		this.accessControlPreexistingAccess = accessControlPreexistingAccess;
	}

	public AppSuppData getAccessControlOther() {
		return accessControlOther;
	}

	public void setAccessControlOther(AppSuppData accessControlOther) {
		this.accessControlOther = accessControlOther;
	}

	public AppSuppData getPreaccessControlExistingLegalLocation() {
		return preaccessControlExistingLegalLocation;
	}

	public void setPreaccessControlExistingLegalLocation(AppSuppData preaccessControlExistingLegalLocation) {
		this.preaccessControlExistingLegalLocation = preaccessControlExistingLegalLocation;
	}

	public AppSuppData getAccessControlsOtherDescription() {
		return accessControlsOtherDescription;
	}

	public void setAccessControlsOtherDescription(AppSuppData accessControlsOtherDescription) {
		this.accessControlsOtherDescription = accessControlsOtherDescription;
	}

	public AppSuppData getAccessControlsAdditionalInfo() {
		return accessControlsAdditionalInfo;
	}

	public void setAccessControlsAdditionalInfo(AppSuppData accessControlsAdditionalInfo) {
		this.accessControlsAdditionalInfo = accessControlsAdditionalInfo;
	}

	public List<HighLevelPlan> getHighLevelPlans() {
		return highLevelPlans;
	}

	public void setHighLevelPlans(List<HighLevelPlan> highLevelPlans) {
		this.highLevelPlans = highLevelPlans;
	}

}
