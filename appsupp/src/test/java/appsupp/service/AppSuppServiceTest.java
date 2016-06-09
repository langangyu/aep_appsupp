package appsupp.service;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
import appsupp.module.AccessClass;
import appsupp.module.AppSuppData;
import appsupp.module.ApplicationSupplement;
import appsupp.module.DomainCode;
import appsupp.module.DomainName;
import appsupp.module.HighLevelLand;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-resources.xml" })
@TransactionConfiguration(defaultRollback = false)
public class AppSuppServiceTest {

	@Autowired
	AppSuppServiceInterface appSuppService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Transactional
	public void testAccessRoad() {
		ApplicationSupplement appSuppBean = appSuppService.createAccessRoad();
		assertEquals("test", appSuppBean.getFormName());

	}

	@Test
	@Transactional
	public void testDao() {
		List<DomainCode> domainCodes = appSuppService.getAppSuppDao().getDomainCodesByDomainName("ATS_QUARTR");

		assertEquals(4, domainCodes.size());

	}

	@Test
	@Transactional
	public void testSaveAppSupp() {

		ApplicationSupplement appSuppBean = new ApplicationSupplement();
		Timestamp createTimestamp = getCurrentTimestamp();
		appSuppBean.setCreateTimestamp(createTimestamp);
		String createUserid = "myself";
		appSuppBean.setCreateUserid(createUserid);

		Timestamp formDate = createTimestamp;
		appSuppBean.setFormDate(formDate);
		String formName = "ESR-001";
		appSuppBean.setFormName(formName);

		appSuppBean.setDomainCodeActivityType(new DomainCode(0, "LOC", "LOC"));
		appSuppBean.setActivityType("LOC");
		appSuppBean.setAccessClass(new AccessClass());
		appSuppBean.getAccessClass().setAppSupp(appSuppBean);

		appSuppBean.getAccessClass().setCreateTimestamp(createTimestamp);
		appSuppBean.getAccessClass().setCreateUserid(createUserid);

		HighLevelLand highLevelLand = new HighLevelLand();
		highLevelLand.setAccessClass(appSuppBean.getAccessClass());
		highLevelLand.setCreateTimestamp(createTimestamp);
		highLevelLand.setCreateUserid(createUserid);

		AppSuppData highLeveLandName = new AppSuppData("ABC land");

		highLeveLandName.setCreateUserid(createUserid);
		highLeveLandName.setCreateTimestamp(createTimestamp);

		highLevelLand.setName(highLeveLandName);

		highLevelLand.setDirection(new AppSuppData("NW"));

		highLevelLand.getDirection().setCreateUserid(createUserid);
		highLevelLand.getDirection().setCreateTimestamp(createTimestamp);

		highLevelLand.setContractSignedDate(new AppSuppData(new java.sql.Timestamp((new Date()).getTime())));

		highLevelLand.getContractSignedDate().setCreateUserid(createUserid);
		highLevelLand.getContractSignedDate().setCreateTimestamp(createTimestamp);

		highLeveLandName.setCreateUserid(createUserid);
		highLeveLandName.setCreateTimestamp(createTimestamp);

		HighLevelLand[] hlls = new HighLevelLand[] { highLevelLand };

		appSuppBean.getAccessClass().setHighLevelLands(java.util.Arrays.asList(hlls));

		this.appSuppService.submit(appSuppBean);

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

	// @Test
	// @Transactional
	public void testSaveDomainCode() {

		DomainCode dn = new DomainCode();
		dn.setCreateTimestamp(getCurrentTimestamp());
		dn.setCreateUserid("alan");
		String domainName = "ATS_QUARTR";
		DomainName domainCodeQt = this.appSuppService.getAppSuppDao().getDomainName(domainName);
		dn.setDomainName(domainCodeQt);

		dn.setDescription("NW");
		dn.setCode("6");

		this.appSuppService.getAppSuppDao().save(dn);

	}
}
