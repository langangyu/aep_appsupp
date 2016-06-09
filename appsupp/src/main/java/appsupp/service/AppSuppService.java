package appsupp.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import appsupp.common.ApplicationException;
import appsupp.dao.AppSuppDao;
import appsupp.module.AccessClass;
import appsupp.module.ApplicationSupplement;
import appsupp.module.DomainCode;
import appsupp.module.HighLevelLand;
import appsupp.module.Reservation;
import appsupp.module.common.AppSuppDomainNames;
import appsupp.module.common.DomainCodesComparator;

@Component
public class AppSuppService implements AppSuppServiceInterface,
		java.io.Serializable {

	private static Logger logger = Logger.getLogger(AppSuppService.class
			.getName());
	/**
	 * 
	 */
	@Autowired
	private AppSuppDao appSuppDao;

	private static final long serialVersionUID = 1L;

	@Override
	@Transactional(readOnly = false)
	public ApplicationSupplement createAccessRoad() throws ApplicationException {
		ApplicationSupplement appSuppBean = new ApplicationSupplement(
				"ACCESSROAD");
		init(appSuppBean);
		Timestamp createTimestamp = new java.sql.Timestamp(
				(new java.util.Date().getTime()));

		appSuppBean.setCreateTimestamp(createTimestamp);
		appSuppBean.setCreateUserid("test");
		appSuppBean.setDomainCodeActivityType(new DomainCode(0, "LOC", "LOC"));
		appSuppBean.setFormName("test");

		appSuppBean.setListOfQuarterTypes(this.getAppSuppDao()
				.getDomainCodesByDomainName("ATS_QUARTR"));
		appSuppBean.getListOfQuarterTypes().add(
				new DomainCode(0, "test", "test"));

		logger.debug("loaded domain codes (QTR) size:"
				+ appSuppBean.getListOfQuarterTypes().size());

		return appSuppBean;

	}

	@Transactional(readOnly = false)
	public boolean submit(ApplicationSupplement appSuppBean) {
		this.getAppSuppDao().save(appSuppBean);
		return true;

	}

	@Transactional(readOnly = false)
	public boolean save(ApplicationSupplement appSuppBean)
			throws ApplicationException {
		this.getAppSuppDao().save(appSuppBean);
		return true;

	}

	public AppSuppDao getAppSuppDao() {
		return appSuppDao;
	}

	public void setAppSuppDao(AppSuppDao appSuppDao) {
		this.appSuppDao = appSuppDao;
	}

	public void init(ApplicationSupplement appSupp) {
		this.initAccessClass(appSupp);
		this.initSupplmentTypes(appSupp);

		this.initApplicationSupplmentTypes(appSupp);
		this.initActivityTypes(appSupp);
		this.initPurposeTypes(appSupp);
		this.initRoadClasses(appSupp);
		this.initAccessControls(appSupp);
		this.initPipelineInstallations(appSupp);
		this.initTopsoilHandlingAffectedAreas(appSupp);
		this.initWellProducts(appSupp);
		this.initSiteRequirements(appSupp);
		this.initElevations(appSupp);
		this.initFlareRequirements(appSupp);
		this.initDrillingWasteHandling(appSupp);
		this.initBrushDisposal(appSupp);
		this.initTopsoilHandlingMethods(appSupp);
		this.initReservationTableTypes(appSupp);
		this.initReservationTablePurposeCodes(appSupp);
		this.initReservationTableRestrictionCodes(appSupp);
		this.initHigherLevelPlanDirections(appSupp);
		this.initHistoricalResourceValues(appSupp);
		this.initSensitiveSpecies(appSupp);
		this.initPurposeActivityTypes(appSupp);
		this.initInitialCrossingMethods(appSupp);
		this.initCulvertBridgeSizes(appSupp);
		this.initWaterCourseSizeClasses(appSupp);
		this.initFinalCrossingMethods(appSupp);
		this.initWaterbodyClasses(appSupp);

		this.initReservationTable(appSupp);
		this.initHigherLevels(appSupp);
	}

	private void initAccessClass(ApplicationSupplement appSupp) {
		AccessClass accessClass = new AccessClass();
		appSupp.setAccessClass(accessClass);

	}

	private List<DomainCode> initList(String domainName) {
		List<DomainCode> theList = getDomainCodes(domainName);
		theList.add(new DomainCode(0, "", ""));
		Collections.sort(theList, new DomainCodesComparator());
		return theList;
	}

	private void initSupplmentTypes(ApplicationSupplement appSupp) {
		List<SelectItem> suppTypes = new ArrayList<SelectItem>();
		suppTypes.add(new SelectItem("", ""));
		suppTypes.add(new SelectItem("applicationSupplement",
				"Application Supplement"));
		suppTypes.add(new SelectItem("mitigationReport", "Mitigation Report"));
		appSupp.setListOfSupplmentTypes(suppTypes);
	}

	private void initApplicationSupplmentTypes(ApplicationSupplement appSupp) {
		List<SelectItem> suppTypes = new ArrayList<SelectItem>();
		suppTypes.add(new SelectItem("", ""));
		suppTypes.add(new SelectItem("accessRoad", "Access Road"));
		suppTypes.add(new SelectItem("pipeline", "Pipeline"));
		suppTypes.add(new SelectItem("siteInstall", "Site Install"));
		appSupp.setListOfApplicationSupplmentTypes(suppTypes);
	}

	private void initActivityTypes(ApplicationSupplement appSupp) {
		appSupp.setListOfActivityTypes(initList(AppSuppDomainNames.ACTIVITY_TYPES));
	}

	private void initPurposeTypes(ApplicationSupplement appSupp) {
		appSupp.setListOfPurposeTypes(initList(AppSuppDomainNames.PURPOSE_TYPES));
	}

	private void initRoadClasses(ApplicationSupplement appSupp) {
		appSupp.setListOfRoadClasses(initList(AppSuppDomainNames.ROAD_CLASSES));
	}

	private void initAccessControls(ApplicationSupplement appSupp) {
		List<DomainCode> theList = getDomainCodes(AppSuppDomainNames.ACCESS_CONTROLS);
		Collections.sort(theList, new DomainCodesComparator());
		appSupp.setListOfAccessControls(theList);
	}

	private void initPipelineInstallations(ApplicationSupplement appSupp) {
		appSupp.setListOfPipelineInstallations(initList(AppSuppDomainNames.PIPELINE_INSTALLATIONS));
	}

	private void initTopsoilHandlingAffectedAreas(ApplicationSupplement appSupp) {
		appSupp.setListOfTopsoilHandlingAffectedAreas(initList(AppSuppDomainNames.TOPSOIL_HANDLING_AFFECTED_AREAS));
	}

	private void initWellProducts(ApplicationSupplement appSupp) {
		appSupp.setListOfWellProducts(initList(AppSuppDomainNames.WELL_PRODUCTS));
	}

	private void initSiteRequirements(ApplicationSupplement appSupp) {
		appSupp.setListOfSiteRequirements(initList(AppSuppDomainNames.SITE_REQUIREMENTS));
	}

	private void initElevations(ApplicationSupplement appSupp) {
		appSupp.setListOfElevations(initList(AppSuppDomainNames.ELEVATIONS));
	}

	private void initFlareRequirements(ApplicationSupplement appSupp) {
		appSupp.setListOfFlareRequirements(initList(AppSuppDomainNames.FLARE_REQUIREMENTS));
	}

	private void initDrillingWasteHandling(ApplicationSupplement appSupp) {
		appSupp.setListOfDrillingWasteHandling(initList(AppSuppDomainNames.DRILLING_WASTE_HANDLING));
	}

	private void initBrushDisposal(ApplicationSupplement appSupp) {
		List<DomainCode> theList = getDomainCodes(AppSuppDomainNames.BRUSH_DISPOSAL);
		Collections.sort(theList, new DomainCodesComparator());
		appSupp.setListOfBrushDisposal(theList);
	}

	private void initTopsoilHandlingMethods(ApplicationSupplement appSupp) {
		appSupp.setListOfTopsoilHandlingMethods(initList(AppSuppDomainNames.TOPSOIL_HANDLING_METHODS));
	}

	private void initReservationTableTypes(ApplicationSupplement appSupp) {
		appSupp.setListOfReservationTableTypes(initList(AppSuppDomainNames.RESERVATION_TABLE_TYPES));
	}

	private void initReservationTablePurposeCodes(ApplicationSupplement appSupp) {
		appSupp.setListOfReservationTablePurposeCodes(initList(AppSuppDomainNames.RESERVATION_TABLE_PURPOSE_CODES));
	}

	private void initReservationTableRestrictionCodes(
			ApplicationSupplement appSupp) {
		appSupp.setListOfReservationTableRestrictionCodes(initList(AppSuppDomainNames.RESERVATION_TABLE_RESTRICTION_CODES));
	}

	private void initHigherLevelPlanDirections(ApplicationSupplement appSupp) {
		appSupp.setListOfHigherLevelPlanDirections(initList(AppSuppDomainNames.HIGHER_LEVEL_PLAN_DIRECTIONS));
	}

	private void initHistoricalResourceValues(ApplicationSupplement appSupp) {
		appSupp.setListOfHistoricalResourceValues(initList(AppSuppDomainNames.HISTORICAL_RESOURCE_VALUES));
	}

	private void initSensitiveSpecies(ApplicationSupplement appSupp) {
		appSupp.setListOfSensitiveSpecies(initList(AppSuppDomainNames.SENSITIVE_SPECIES));
	}

	private void initPurposeActivityTypes(ApplicationSupplement appSupp) {
		appSupp.setListOfPurposeActivityTypes(initList(AppSuppDomainNames.PURPOSE_ACTIVITY_TYPES));
	}

	private void initInitialCrossingMethods(ApplicationSupplement appSupp) {
		appSupp.setListOfInitialCrossingMethods(initList(AppSuppDomainNames.INITIAL_CROSSING_METHODS));
	}

	private void initCulvertBridgeSizes(ApplicationSupplement appSupp) {
		appSupp.setListOfCulvertBridgeSizes(initList(AppSuppDomainNames.CULVERT_BRIDGE_SIZES));
	}

	private void initWaterCourseSizeClasses(ApplicationSupplement appSupp) {
		appSupp.setListOfWaterCourseSizeClasses(initList(AppSuppDomainNames.WATER_COURSE_SIZE_CLASSES));
	}

	private void initFinalCrossingMethods(ApplicationSupplement appSupp) {
		appSupp.setListOfFinalCrossingMethods(initList(AppSuppDomainNames.FINAL_CROSSING_METHODS));
	}

	private void initWaterbodyClasses(ApplicationSupplement appSupp) {
		appSupp.setListOfWaterbodyClasses(initList(AppSuppDomainNames.WATERBODY_CLASSES));
	}

	private List<DomainCode> getDomainCodes(String theDomainName) {
		List<DomainCode> domainCodes = new ArrayList<DomainCode>();
		domainCodes.add(new DomainCode(1, "test code", "test description"));
		domainCodes.add(new DomainCode(2, "abc code", "abc description"));
		return domainCodes; // appSuppService.getAppsuppDao().getDomainCodesByDomainName(theDomainName);
	}

	private void initReservationTable(ApplicationSupplement appSupp) {
		List<Reservation> reservations = new ArrayList<Reservation>();
		reservations.add(new Reservation());
		appSupp.setReservations(reservations);
	}

	private void initHigherLevels(ApplicationSupplement appSupp) {
		List<HighLevelLand> highLevelLands = new ArrayList<HighLevelLand>();
		highLevelLands.add(new HighLevelLand());
		appSupp.getAccessClass().setHighLevelLands(highLevelLands);
	}

	public void addNewHighLevelLand(ApplicationSupplement appSuppBean) {

		HighLevelLand highLevelLand = new HighLevelLand();

		Timestamp currentTime = this.getCurrentTimestamp();
		highLevelLand.setCreateTimestamp(currentTime);
		highLevelLand.setCreateUserid(appSuppBean.getCreateUserid());
		highLevelLand.setRowNumber(appSuppBean.getAccessClass()
				.getHighLevelLands().size());

		appSuppBean.getAccessClass().getHighLevelLands().add(highLevelLand);
	}

	public void addNewReservation(ApplicationSupplement appSuppBean) {

		Reservation reservation = new Reservation();

		Timestamp currentTime = this.getCurrentTimestamp();
		reservation.setCreateTimestamp(currentTime);
		reservation.setCreateUserid(appSuppBean.getCreateUserid());
		reservation.setRowNumber(appSuppBean.getReservations().size());

		appSuppBean.getReservations().add(reservation);
	}

	protected Timestamp getCurrentTimestamp() {
		return new Timestamp((new Date()).getTime());
	}
}
