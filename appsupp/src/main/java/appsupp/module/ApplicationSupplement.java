package appsupp.module;

import java.sql.Timestamp;
import java.util.List;

import javax.faces.model.SelectItem;

public class ApplicationSupplement implements java.io.Serializable {

	private static final long serialVersionUID = 8596662541307991172L;
	private Integer appSuppId;
	private String supplmentType;
	private Timestamp formDate;
	private String formName;

	private String activityType;
	
	//Section 1 
	private AccessClass accessClass;
	private SiteSensitivity siteSensitivity;
	
	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;

	// NOT MAPPED
	// FOR testing
	private List<DomainCode> listOfQuarterTypes;
	private DomainCode domainCodeQuarter;
	private boolean govApprovedHighLeveLand;
	
	// common start
	private String applicationSupplmentType;
	private Timestamp appSuppDate;
	private String projectName;
	private String latNumber;
	private DomainCode domainCodeActivityType;
	private DomainCode domainCodePurposeType;
	
	// Common - Section A
	private Boolean merchantableTimber;
	private String methodROWDescription;
	private String[] selectedBrushDisposal = new String[0];
	private String disposalOtherDescription;
	private DomainCode domainCodeTopsoilHandlingMethod;
	private String topsoilHandlingMethodDescription;
	private String soilDebrisStorageDescription;
	private Boolean reservationsNotationsPlansIdentified;
	private List<Reservation> reservations;
	private Boolean higherLevelPlansIdentified;

	private Timestamp historicalResourcesSearchCompletedDate;
	private DomainCode domainCodeHistoricalResourceValue;
	private Timestamp dateApplicationSubmitted;
	
	// Access - Section A
	private DomainCode domainCodeRoadClass;
	private Boolean variableConstructionTechniques;
	private Boolean processFollowed;
	private Boolean accessControlsRequired;
	private String[] selectedAccessControls = new String[0];
	private boolean accessControlPreexistingAccess;
	private boolean accessControlOther;
	private String accessControlsPreExistingLegalLocation;
	private String accessControlsOtherDescription;
	private String accessControlsAdditionalInfo;

	// Section B
	private Boolean wildlifeSurveyRequired;
	private Boolean sensitiveSpeciesIdentified;
	private String[] selectedSensitiveSpecies = new String[0];
	private Boolean otherSensitiveSpecies;
	private String otherSensitiveSpeciesDescription;

	// Section C
	private List<IncidentalActivity> incidentalActivities;
	
	// Section D
	private Boolean watercoursesCrossedByVehicles;
	private List<WatercourseCrossing> watercourseCrossings;
	
	// Pipeline - Section A
	private Boolean multiPipeInstallation;
	private String pipeOutsideDiameter;
	private DomainCode domainCodePipelineInstallation;
	private String pipelineInstallationDescription;
	private DomainCode domainCodeTopsoilHandlingAffectedArea;

	// SiteInstalls - Section A
	private DomainCode domainCodeWellProduct;
	private String wellProductDescription;
	private DomainCode domainCodeSiteRequirements;
	private DomainCode domainCodeElevation;
	private DomainCode domainCodeFlareRequirements;
	private DomainCode domainCodeDrillingWasteHandling;
	private String drillingWasteHandlingDescription;
	
	// for the screen drop-down lists for AppSupp
	private List<SelectItem> listOfSupplmentTypes;
	private List<SelectItem> listOfApplicationSupplmentTypes;
	private List<DomainCode> listOfActivityTypes;
	private List<DomainCode> listOfPurposeTypes;
	
	// Access - Section A
	private List<DomainCode> listOfRoadClasses;
	private List<DomainCode> listOfAccessControls;
	
	// Pipeline - Section A
	private List<DomainCode> listOfPipelineInstallations;
	private List<DomainCode> listOfTopsoilHandlingAffectedAreas;
	
	// SiteInstalls - Section A
	private List<DomainCode> listOfWellProducts;
	private List<DomainCode> listOfSiteRequirements;
	private List<DomainCode> listOfElevations;
	private List<DomainCode> listOfFlareRequirements;
	private List<DomainCode> listOfDrillingWasteHandling;
	
	// Common - Section A
	private List<DomainCode> listOfBrushDisposal;
	private List<DomainCode> listOfTopsoilHandlingMethods;
	private List<DomainCode> listOfReservationTableTypes;
	private List<DomainCode> listOfReservationTablePurposeCodes;
	private List<DomainCode> listOfReservationTableRestrictionCodes;
	private List<DomainCode> listOfHigherLevelPlanDirections;
	private List<DomainCode> listOfHistoricalResourceValues;
	
	// Common - Section B
	private List<DomainCode> listOfSensitiveSpecies;
	
	// Common - Section C
	private List<DomainCode> listOfPurposeActivityTypes;
	
	// Common - Section D
	private List<DomainCode> listOfInitialCrossingMethods;
	private List<DomainCode> listOfCulvertBridgeSizes;
	private List<DomainCode> listOfWaterCourseSizeClasses;
	private List<DomainCode> listOfFinalCrossingMethods;
	private List<DomainCode> listOfWaterbodyClasses;

	public ApplicationSupplement() {
		
	}

	public ApplicationSupplement(String formName) {
		this.formName = formName;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Timestamp getFormDate() {
		return formDate;
	}

	public void setFormDate(Timestamp formDate) {
		this.formDate = formDate;
	}

	public String getSupplmentType() {
		return supplmentType;
	}

	public void setSupplmentType(String supplmentType) {
		this.supplmentType = supplmentType;
	}

	public Integer getAppSuppId() {
		return appSuppId;
	}

	public void setAppSuppId(Integer appSuppId) {
		this.appSuppId = appSuppId;
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

	public DomainCode getDomainCodeQuarter() {
		return domainCodeQuarter;
	}

	public void setDomainCodeQuarter(DomainCode domainCodeQuarter) {
		this.domainCodeQuarter = domainCodeQuarter;
	}

	public List<DomainCode> getListOfQuarterTypes() {
		return listOfQuarterTypes;
	}

	public void setListOfQuarterTypes(List<DomainCode> listOfQuarterTypes) {
		this.listOfQuarterTypes = listOfQuarterTypes;
	}

	public boolean isGovApprovedHighLeveLand() {
		return govApprovedHighLeveLand;
	}

	public void setGovApprovedHighLeveLand(boolean govApprovedHighLeveLand) {
		this.govApprovedHighLeveLand = govApprovedHighLeveLand;
	}
	
	public DomainCode getDomainCodeActivityType() {
		return domainCodeActivityType;
	}

	public void setDomainCodeActivityType(DomainCode domainCodeActivityType) {
		this.domainCodeActivityType = domainCodeActivityType;
	}
	
	public String getApplicationSupplmentType() {
		return applicationSupplmentType;
	}

	public void setApplicationSupplmentType(String applicationSupplmentType) {
		this.applicationSupplmentType = applicationSupplmentType;
	}
	
	public Timestamp getAppSuppDate() {
		return appSuppDate;
	}

	public void setAppSuppDate(Timestamp appSuppDate) {
		this.appSuppDate = appSuppDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getLatNumber() {
		return latNumber;
	}

	public void setLatNumber(String latNumber) {
		this.latNumber = latNumber;
	}

	public DomainCode getDomainCodePurposeType() {
		return domainCodePurposeType;
	}

	public void setDomainCodePurposeType(DomainCode domainCodePurposeType) {
		this.domainCodePurposeType = domainCodePurposeType;
	}

	public Boolean getMerchantableTimber() {
		return merchantableTimber;
	}

	public void setMerchantableTimber(Boolean merchantableTimber) {
		this.merchantableTimber = merchantableTimber;
	}

	public String getMethodROWDescription() {
		return methodROWDescription;
	}

	public void setMethodROWDescription(String methodROWDescription) {
		this.methodROWDescription = methodROWDescription;
	}

	public String[] getSelectedBrushDisposal() {
		return selectedBrushDisposal;
	}

	public void setSelectedBrushDisposal(String[] selectedBrushDisposal) {
		this.selectedBrushDisposal = selectedBrushDisposal;
	}

	public String getDisposalOtherDescription() {
		return disposalOtherDescription;
	}

	public void setDisposalOtherDescription(String disposalOtherDescription) {
		this.disposalOtherDescription = disposalOtherDescription;
	}

	public DomainCode getDomainCodeTopsoilHandlingMethod() {
		return domainCodeTopsoilHandlingMethod;
	}

	public void setDomainCodeTopsoilHandlingMethod(DomainCode domainCodeTopsoilHandlingMethod) {
		this.domainCodeTopsoilHandlingMethod = domainCodeTopsoilHandlingMethod;
	}

	public String getTopsoilHandlingMethodDescription() {
		return topsoilHandlingMethodDescription;
	}

	public void setTopsoilHandlingMethodDescription(String topsoilHandlingMethodDescription) {
		this.topsoilHandlingMethodDescription = topsoilHandlingMethodDescription;
	}

	public String getSoilDebrisStorageDescription() {
		return soilDebrisStorageDescription;
	}

	public void setSoilDebrisStorageDescription(String soilDebrisStorageDescription) {
		this.soilDebrisStorageDescription = soilDebrisStorageDescription;
	}

	public Boolean getReservationsNotationsPlansIdentified() {
		return reservationsNotationsPlansIdentified;
	}

	public void setReservationsNotationsPlansIdentified(Boolean reservationsNotationsPlansIdentified) {
		this.reservationsNotationsPlansIdentified = reservationsNotationsPlansIdentified;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Boolean getHigherLevelPlansIdentified() {
		return higherLevelPlansIdentified;
	}

	public void setHigherLevelPlansIdentified(Boolean higherLevelPlansIdentified) {
		this.higherLevelPlansIdentified = higherLevelPlansIdentified;
	}


	public Timestamp getHistoricalResourcesSearchCompletedDate() {
		return historicalResourcesSearchCompletedDate;
	}

	public void setHistoricalResourcesSearchCompletedDate(Timestamp historicalResourcesSearchCompletedDate) {
		this.historicalResourcesSearchCompletedDate = historicalResourcesSearchCompletedDate;
	}

	public DomainCode getDomainCodeHistoricalResourceValue() {
		return domainCodeHistoricalResourceValue;
	}

	public void setDomainCodeHistoricalResourceValue(DomainCode domainCodeHistoricalResourceValue) {
		this.domainCodeHistoricalResourceValue = domainCodeHistoricalResourceValue;
	}

	public Timestamp getDateApplicationSubmitted() {
		return dateApplicationSubmitted;
	}

	public void setDateApplicationSubmitted(Timestamp dateApplicationSubmitted) {
		this.dateApplicationSubmitted = dateApplicationSubmitted;
	}

	public DomainCode getDomainCodeRoadClass() {
		return domainCodeRoadClass;
	}

	public void setDomainCodeRoadClass(DomainCode domainCodeRoadClass) {
		this.domainCodeRoadClass = domainCodeRoadClass;
	}

	public Boolean getVariableConstructionTechniques() {
		return variableConstructionTechniques;
	}

	public void setVariableConstructionTechniques(Boolean variableConstructionTechniques) {
		this.variableConstructionTechniques = variableConstructionTechniques;
	}

	public Boolean getProcessFollowed() {
		return processFollowed;
	}

	public void setProcessFollowed(Boolean processFollowed) {
		this.processFollowed = processFollowed;
	}

	public Boolean getAccessControlsRequired() {
		return accessControlsRequired;
	}

	public void setAccessControlsRequired(Boolean accessControlsRequired) {
		this.accessControlsRequired = accessControlsRequired;
	}

	public String[] getSelectedAccessControls() {
		return selectedAccessControls;
	}

	public void setSelectedAccessControls(String[] selectedAccessControls) {
		this.selectedAccessControls = selectedAccessControls;
	}
	
	public boolean isAccessControlPreexistingAccess() {
		return accessControlPreexistingAccess;
	}

	public void setAccessControlPreexistingAccess(boolean accessControlPreexistingAccess) {
		this.accessControlPreexistingAccess = accessControlPreexistingAccess;
	}

	public boolean isAccessControlOther() {
		return accessControlOther;
	}

	public void setAccessControlOther(boolean accessControlOther) {
		this.accessControlOther = accessControlOther;
	}

	public String getAccessControlsPreExistingLegalLocation() {
		return accessControlsPreExistingLegalLocation;
	}

	public void setAccessControlsPreExistingLegalLocation(String accessControlsPreExistingLegalLocation) {
		this.accessControlsPreExistingLegalLocation = accessControlsPreExistingLegalLocation;
	}

	public String getAccessControlsOtherDescription() {
		return accessControlsOtherDescription;
	}

	public void setAccessControlsOtherDescription(String accessControlsOtherDescription) {
		this.accessControlsOtherDescription = accessControlsOtherDescription;
	}

	public String getAccessControlsAdditionalInfo() {
		return accessControlsAdditionalInfo;
	}

	public void setAccessControlsAdditionalInfo(String accessControlsAdditionalInfo) {
		this.accessControlsAdditionalInfo = accessControlsAdditionalInfo;
	}

	public Boolean getWildlifeSurveyRequired() {
		return wildlifeSurveyRequired;
	}

	public void setWildlifeSurveyRequired(Boolean wildlifeSurveyRequired) {
		this.wildlifeSurveyRequired = wildlifeSurveyRequired;
	}

	public Boolean getSensitiveSpeciesIdentified() {
		return sensitiveSpeciesIdentified;
	}

	public void setSensitiveSpeciesIdentified(Boolean sensitiveSpeciesIdentified) {
		this.sensitiveSpeciesIdentified = sensitiveSpeciesIdentified;
	}

	public String[] getSelectedSensitiveSpecies() {
		return selectedSensitiveSpecies;
	}

	public void setSelectedSensitiveSpecies(String[] selectedSensitiveSpecies) {
		this.selectedSensitiveSpecies = selectedSensitiveSpecies;
	}

	public Boolean getOtherSensitiveSpecies() {
		return otherSensitiveSpecies;
	}

	public void setOtherSensitiveSpecies(Boolean otherSensitiveSpecies) {
		this.otherSensitiveSpecies = otherSensitiveSpecies;
	}
	
	public String getOtherSensitiveSpeciesDescription() {
		return otherSensitiveSpeciesDescription;
	}

	public void setOtherSensitiveSpeciesDescription(String otherSensitiveSpeciesDescription) {
		this.otherSensitiveSpeciesDescription = otherSensitiveSpeciesDescription;
	}

	public List<IncidentalActivity> getIncidentalActivities() {
		return incidentalActivities;
	}

	public void setIncidentalActivities(List<IncidentalActivity> incidentalActivities) {
		this.incidentalActivities = incidentalActivities;
	}

	public Boolean getWatercoursesCrossedByVehicles() {
		return watercoursesCrossedByVehicles;
	}

	public void setWatercoursesCrossedByVehicles(Boolean watercoursesCrossedByVehicles) {
		this.watercoursesCrossedByVehicles = watercoursesCrossedByVehicles;
	}

	public List<WatercourseCrossing> getWatercourseCrossings() {
		return watercourseCrossings;
	}

	public void setWatercourseCrossings(List<WatercourseCrossing> watercourseCrossings) {
		this.watercourseCrossings = watercourseCrossings;
	}

	public Boolean getMultiPipeInstallation() {
		return multiPipeInstallation;
	}

	public void setMultiPipeInstallation(Boolean multiPipeInstallation) {
		this.multiPipeInstallation = multiPipeInstallation;
	}

	public String getPipeOutsideDiameter() {
		return pipeOutsideDiameter;
	}

	public void setPipeOutsideDiameter(String pipeOutsideDiameter) {
		this.pipeOutsideDiameter = pipeOutsideDiameter;
	}

	public DomainCode getDomainCodePipelineInstallation() {
		return domainCodePipelineInstallation;
	}

	public void setDomainCodePipelineInstallation(DomainCode domainCodePipelineInstallation) {
		this.domainCodePipelineInstallation = domainCodePipelineInstallation;
	}

	public String getPipelineInstallationDescription() {
		return pipelineInstallationDescription;
	}

	public void setPipelineInstallationDescription(String pipelineInstallationDescription) {
		this.pipelineInstallationDescription = pipelineInstallationDescription;
	}

	public DomainCode getDomainCodeTopsoilHandlingAffectedArea() {
		return domainCodeTopsoilHandlingAffectedArea;
	}

	public void setDomainCodeTopsoilHandlingAffectedArea(DomainCode domainCodeTopsoilHandlingAffectedArea) {
		this.domainCodeTopsoilHandlingAffectedArea = domainCodeTopsoilHandlingAffectedArea;
	}

	public DomainCode getDomainCodeWellProduct() {
		return domainCodeWellProduct;
	}

	public void setDomainCodeWellProduct(DomainCode domainCodeWellProduct) {
		this.domainCodeWellProduct = domainCodeWellProduct;
	}

	public String getWellProductDescription() {
		return wellProductDescription;
	}

	public void setWellProductDescription(String wellProductDescription) {
		this.wellProductDescription = wellProductDescription;
	}

	public DomainCode getDomainCodeSiteRequirements() {
		return domainCodeSiteRequirements;
	}

	public void setDomainCodeSiteRequirements(DomainCode domainCodeSiteRequirements) {
		this.domainCodeSiteRequirements = domainCodeSiteRequirements;
	}

	public DomainCode getDomainCodeElevation() {
		return domainCodeElevation;
	}

	public void setDomainCodeElevation(DomainCode domainCodeElevation) {
		this.domainCodeElevation = domainCodeElevation;
	}

	public DomainCode getDomainCodeFlareRequirements() {
		return domainCodeFlareRequirements;
	}

	public void setDomainCodeFlareRequirements(DomainCode domainCodeFlareRequirements) {
		this.domainCodeFlareRequirements = domainCodeFlareRequirements;
	}

	public DomainCode getDomainCodeDrillingWasteHandling() {
		return domainCodeDrillingWasteHandling;
	}

	public void setDomainCodeDrillingWasteHandling(DomainCode domainCodeDrillingWasteHandling) {
		this.domainCodeDrillingWasteHandling = domainCodeDrillingWasteHandling;
	}

	public String getDrillingWasteHandlingDescription() {
		return drillingWasteHandlingDescription;
	}

	public void setDrillingWasteHandlingDescription(String drillingWasteHandlingDescription) {
		this.drillingWasteHandlingDescription = drillingWasteHandlingDescription;
	}
	
	public List<SelectItem> getListOfSupplmentTypes() {
		return listOfSupplmentTypes;
	}

	public void setListOfSupplmentTypes(List<SelectItem> listOfSupplmentTypes) {
		this.listOfSupplmentTypes = listOfSupplmentTypes;
	}
	
	public List<SelectItem> getListOfApplicationSupplmentTypes() {
		return listOfApplicationSupplmentTypes;
	}

	public void setListOfApplicationSupplmentTypes(List<SelectItem> listOfApplicationSupplmentTypes) {
		this.listOfApplicationSupplmentTypes = listOfApplicationSupplmentTypes;
	}
	
	public List<DomainCode> getListOfActivityTypes() {
		return listOfActivityTypes;
	}

	public void setListOfActivityTypes(List<DomainCode> listOfActivityTypes) {
		this.listOfActivityTypes = listOfActivityTypes;
	}
	
	public List<DomainCode> getListOfPurposeTypes() {
		return listOfPurposeTypes;
	}

	public void setListOfPurposeTypes(List<DomainCode> listOfPurposeTypes) {
		this.listOfPurposeTypes = listOfPurposeTypes;
	}
	
	public List<DomainCode> getListOfRoadClasses() {
		return listOfRoadClasses;
	}

	public void setListOfRoadClasses(List<DomainCode> listOfRoadClasses) {
		this.listOfRoadClasses = listOfRoadClasses;
	}

	public List<DomainCode> getListOfAccessControls() {
		return listOfAccessControls;
	}

	public void setListOfAccessControls(List<DomainCode> listOfAccessControls) {
		this.listOfAccessControls = listOfAccessControls;
	}

	public List<DomainCode> getListOfPipelineInstallations() {
		return listOfPipelineInstallations;
	}

	public void setListOfPipelineInstallations(List<DomainCode> listOfPipelineInstallations) {
		this.listOfPipelineInstallations = listOfPipelineInstallations;
	}

	public List<DomainCode> getListOfTopsoilHandlingAffectedAreas() {
		return listOfTopsoilHandlingAffectedAreas;
	}

	public void setListOfTopsoilHandlingAffectedAreas(List<DomainCode> listOfTopsoilHandlingAffectedAreas) {
		this.listOfTopsoilHandlingAffectedAreas = listOfTopsoilHandlingAffectedAreas;
	}

	public List<DomainCode> getListOfWellProducts() {
		return listOfWellProducts;
	}

	public void setListOfWellProducts(List<DomainCode> listOfWellProducts) {
		this.listOfWellProducts = listOfWellProducts;
	}

	public List<DomainCode> getListOfSiteRequirements() {
		return listOfSiteRequirements;
	}

	public void setListOfSiteRequirements(List<DomainCode> listOfSiteRequirements) {
		this.listOfSiteRequirements = listOfSiteRequirements;
	}

	public List<DomainCode> getListOfElevations() {
		return listOfElevations;
	}

	public void setListOfElevations(List<DomainCode> listOfElevations) {
		this.listOfElevations = listOfElevations;
	}

	public List<DomainCode> getListOfFlareRequirements() {
		return listOfFlareRequirements;
	}

	public void setListOfFlareRequirements(List<DomainCode> listOfFlareRequirements) {
		this.listOfFlareRequirements = listOfFlareRequirements;
	}

	public List<DomainCode> getListOfDrillingWasteHandling() {
		return listOfDrillingWasteHandling;
	}

	public void setListOfDrillingWasteHandling(List<DomainCode> listOfDrillingWasteHandling) {
		this.listOfDrillingWasteHandling = listOfDrillingWasteHandling;
	}

	public List<DomainCode> getListOfBrushDisposal() {
		return listOfBrushDisposal;
	}

	public void setListOfBrushDisposal(List<DomainCode> listOfBrushDisposal) {
		this.listOfBrushDisposal = listOfBrushDisposal;
	}

	public List<DomainCode> getListOfTopsoilHandlingMethods() {
		return listOfTopsoilHandlingMethods;
	}

	public void setListOfTopsoilHandlingMethods(List<DomainCode> listOfTopsoilHandlingMethods) {
		this.listOfTopsoilHandlingMethods = listOfTopsoilHandlingMethods;
	}

	public List<DomainCode> getListOfReservationTableTypes() {
		return listOfReservationTableTypes;
	}

	public void setListOfReservationTableTypes(List<DomainCode> listOfReservationTableTypes) {
		this.listOfReservationTableTypes = listOfReservationTableTypes;
	}

	public List<DomainCode> getListOfReservationTablePurposeCodes() {
		return listOfReservationTablePurposeCodes;
	}

	public void setListOfReservationTablePurposeCodes(List<DomainCode> listOfReservationTablePurposeCodes) {
		this.listOfReservationTablePurposeCodes = listOfReservationTablePurposeCodes;
	}

	public List<DomainCode> getListOfReservationTableRestrictionCodes() {
		return listOfReservationTableRestrictionCodes;
	}

	public void setListOfReservationTableRestrictionCodes(List<DomainCode> listOfReservationTableRestrictionCodes) {
		this.listOfReservationTableRestrictionCodes = listOfReservationTableRestrictionCodes;
	}

	public List<DomainCode> getListOfHigherLevelPlanDirections() {
		return listOfHigherLevelPlanDirections;
	}

	public void setListOfHigherLevelPlanDirections(List<DomainCode> listOfHigherLevelPlanDirections) {
		this.listOfHigherLevelPlanDirections = listOfHigherLevelPlanDirections;
	}

	public List<DomainCode> getListOfHistoricalResourceValues() {
		return listOfHistoricalResourceValues;
	}

	public void setListOfHistoricalResourceValues(List<DomainCode> listOfHistoricalResourceValues) {
		this.listOfHistoricalResourceValues = listOfHistoricalResourceValues;
	}

	public List<DomainCode> getListOfSensitiveSpecies() {
		return listOfSensitiveSpecies;
	}

	public void setListOfSensitiveSpecies(List<DomainCode> listOfSensitiveSpecies) {
		this.listOfSensitiveSpecies = listOfSensitiveSpecies;
	}

	public List<DomainCode> getListOfPurposeActivityTypes() {
		return listOfPurposeActivityTypes;
	}

	public void setListOfPurposeActivityTypes(List<DomainCode> listOfPurposeActivityTypes) {
		this.listOfPurposeActivityTypes = listOfPurposeActivityTypes;
	}

	public List<DomainCode> getListOfInitialCrossingMethods() {
		return listOfInitialCrossingMethods;
	}

	public void setListOfInitialCrossingMethods(List<DomainCode> listOfInitialCrossingMethods) {
		this.listOfInitialCrossingMethods = listOfInitialCrossingMethods;
	}

	public List<DomainCode> getListOfCulvertBridgeSizes() {
		return listOfCulvertBridgeSizes;
	}

	public void setListOfCulvertBridgeSizes(List<DomainCode> listOfCulvertBridgeSizes) {
		this.listOfCulvertBridgeSizes = listOfCulvertBridgeSizes;
	}

	public List<DomainCode> getListOfWaterCourseSizeClasses() {
		return listOfWaterCourseSizeClasses;
	}

	public void setListOfWaterCourseSizeClasses(List<DomainCode> listOfWaterCourseSizeClasses) {
		this.listOfWaterCourseSizeClasses = listOfWaterCourseSizeClasses;
	}

	public List<DomainCode> getListOfFinalCrossingMethods() {
		return listOfFinalCrossingMethods;
	}

	public void setListOfFinalCrossingMethods(List<DomainCode> listOfFinalCrossingMethods) {
		this.listOfFinalCrossingMethods = listOfFinalCrossingMethods;
	}

	public List<DomainCode> getListOfWaterbodyClasses() {
		return listOfWaterbodyClasses;
	}

	public void setListOfWaterbodyClasses(List<DomainCode> listOfWaterbodyClasses) {
		this.listOfWaterbodyClasses = listOfWaterbodyClasses;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public AccessClass getAccessClass() {
		return accessClass;
	}

	public void setAccessClass(AccessClass accessClass) {
		this.accessClass = accessClass;
	}

	public SiteSensitivity getSiteSensitivity() {
		return siteSensitivity;
	}

	public void setSiteSensitivity(SiteSensitivity siteSensitivity) {
		this.siteSensitivity = siteSensitivity;
	}
}
