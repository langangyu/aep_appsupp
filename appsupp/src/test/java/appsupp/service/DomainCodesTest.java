package appsupp.service;

import java.sql.Timestamp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import appsupp.App;
import appsupp.common.AppSuppDomainNames;
import appsupp.module.DomainCode;
import appsupp.module.DomainName;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-resources.xml" })
@TransactionConfiguration(defaultRollback = false)
public class DomainCodesTest {

	@Autowired
	AppSuppServiceInterface appSuppService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private Timestamp getCurrentTimestamp() {
		return new java.sql.Timestamp((new java.util.Date()).getTime());
	}

	// @Test
	// @Transactional
	public void testSaveDomainName() {

		DomainName dn = new DomainName();
		dn.setCreateTimestamp(getCurrentTimestamp());
		dn.setCreateUserid("alan");
		String domainName = "ATS_QUARTR";
		dn.setDomainName(domainName);
		dn.setAppCode(App.APPLICATION_CODE);
		String domainPrompt = "domain prompt";
		dn.setDomainPrompt(domainPrompt);
		this.appSuppService.getAppSuppDao().save(dn);

	}

	@Test
	@Transactional
	public void testSaveDomainNameForFields() {

		DomainName dn = new DomainName();
		dn.setCreateTimestamp(getCurrentTimestamp());
		dn.setCreateUserid("alan");
		String domainName = AppSuppDomainNames.HIGH_LEVEL_PLAN;
		dn.setDomainName(domainName);
		dn.setAppCode(App.APPLICATION_CODE);
		String domainPrompt = "SECTION FOR high level lands";
		dn.setDomainPrompt(domainPrompt);
		this.appSuppService.getAppSuppDao().save(dn);

	}

	@Test
	@Transactional
	public void testSaveDomainCode() {

		DomainCode dc = new DomainCode();
		dc.setCreateTimestamp(getCurrentTimestamp());
		dc.setCreateUserid("alan");
		String domainName = AppSuppDomainNames.HIGH_LEVEL_PLAN;
		DomainName domainCodeHll = this.appSuppService.getAppSuppDao().getDomainName(domainName);
		dc.setDomainName(domainCodeHll);
		dc.setDataType(AppSuppDomainNames.STRING_DATA_TYPE);
		dc.setDescription("contractSignedDate");
		dc.setCode("contractSignedDate");
		

//		private AppSuppData direction;
//		private AppSuppData contractSignedDate;
//		private int rowNumbe

		this.appSuppService.getAppSuppDao().save(dc);

	}
}
