package appsupp.service;

import org.apache.log4j.Logger;

import appsupp.common.ApplicationException;
import appsupp.dao.AppSuppDao;
import appsupp.module.ApplicationSupplement;

public class AppSuppSearchService implements AppSuppServiceInterface, java.io.Serializable {

	private static Logger logger = Logger.getLogger(AppSuppSearchService.class.getName());
	/**
	 * 
	 */
	private AppSuppDao appSuppDao;

	private static final long serialVersionUID = 1L;

	public AppSuppDao getAppSuppDao() {
		return appSuppDao;
	}

	public void setAppSuppDao(AppSuppDao appSuppDao) {
		this.appSuppDao = appSuppDao;
	}

	@Override
	public ApplicationSupplement createAccessRoad() throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(ApplicationSupplement appSuppBean) throws ApplicationException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean submit(ApplicationSupplement appSuppBean) {
		// TODO Auto-generated method stub
		return false;
	}

 
	@Override
	public void init(ApplicationSupplement appSuppBean) {
		// TODO Auto-generated method stub

	}

	@Override
	public ApplicationSupplement getApplicationSupplement(Integer appSuppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewHighLevelLand(ApplicationSupplement appSuppBean) {
		// TODO Auto-generated method stub
		
	}
}
