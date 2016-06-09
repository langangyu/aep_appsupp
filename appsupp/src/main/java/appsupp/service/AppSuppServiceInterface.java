package appsupp.service;

import appsupp.common.ApplicationException;
import appsupp.dao.AppSuppDao;
import appsupp.module.AccessClass;
import appsupp.module.ApplicationSupplement;

public interface AppSuppServiceInterface {
	public ApplicationSupplement createAccessRoad() throws ApplicationException;

	public boolean save(ApplicationSupplement appSuppBean) throws ApplicationException;

	public boolean submit(ApplicationSupplement appSuppBean);

	public AppSuppDao getAppSuppDao();

	public void setAppSuppDao(AppSuppDao appSuppDao);

	public void addNewHighLevelLand(AccessClass accessClass);

	
	
	public void init(ApplicationSupplement appSuppBean);

	public ApplicationSupplement getApplicationSupplement(Integer appSuppId);
}
