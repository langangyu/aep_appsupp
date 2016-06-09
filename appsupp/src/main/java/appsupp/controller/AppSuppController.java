package appsupp.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

@Controller
public class AppSuppController implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<String> violations = new ArrayList<String>(0);

	public AppSuppController() throws Exception {

	}

	public ArrayList<String> getViolations() {
		return violations;
	}

	public void setViolations(ArrayList<String> violations) {
		this.violations = violations;
	}
}
