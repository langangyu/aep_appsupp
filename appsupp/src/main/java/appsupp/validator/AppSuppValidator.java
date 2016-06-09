package appsupp.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import appsupp.module.ApplicationSupplement;
import appsupp.service.AppSuppService;

public class AppSuppValidator implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AppSuppService appSuppService;

	public AppSuppService getAppSuppService() {
		return appSuppService;
	}

	public void setAppSuppService(AppSuppService appSuppService) {
		this.appSuppService = appSuppService;
	}
	
	public void validateStuff(ApplicationSupplement appSupp, List<String> violations) {
		// TODO: add validation methods...
	}
}
