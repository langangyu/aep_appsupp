package appsupp.service;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
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
import appsupp.module.ApplicationSupplement;
import appsupp.module.DataItem;
import appsupp.module.DomainCode;
import appsupp.module.DomainName;
import appsupp.module.HighLevelPlan;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-resources.xml" })
@TransactionConfiguration(defaultRollback = false)
public class AppSuppServiceTest {

	private static Logger logger = Logger.getLogger(AppSuppServiceTest.class.getName());
	/**
	 * 
	 */
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

//		HighLevelPlan highLevelPlan = new HighLevelPlan(createTimestamp, createUserid);
//		highLevelPlan.setApplicationSupplement(appSuppBean);
// 
		this.appSuppService.init(appSuppBean);

		this.appSuppService.submit(appSuppBean);

	}

	@Test
	@Transactional
	public void testGetAppSupp() {

		Integer appSuppId = new Integer(6);

		ApplicationSupplement appSupp = this.appSuppService.getApplicationSupplement(appSuppId);
		assertEquals(3, appSupp.getHighLevelPlans().get(0).getFields().size());

	}

	@Test
	@Transactional
	public void testModifyAppSupp() {

		Integer appSuppId = new Integer(5);

		ApplicationSupplement appSupp = this.appSuppService.getApplicationSupplement(appSuppId);
		Map<String, DataItem> fields = appSupp.getHighLevelPlans().get(0).getFields();

		Set<Map.Entry<String, DataItem>> set = fields.entrySet();
		Iterator<Map.Entry<String, DataItem>> iteratorEntry = set.iterator();
		while (iteratorEntry.hasNext()) {
			Map.Entry<String, DataItem> entry = (Map.Entry<String, DataItem>) iteratorEntry.next();
			logger.debug("label:" + entry.getKey());

			DataItem appSuppData = entry.getValue();

			logger.debug("appSuppData:" + appSuppData.getStringValue());
			if (entry.getKey().equals("direction"))
				iteratorEntry.remove();

		}

		this.appSuppService.save(appSupp);
	}

	@Test
	@Transactional
	public void testModifyAppSuppData() {

		Integer appSuppId = new Integer(6);

		ApplicationSupplement appSupp = this.appSuppService.getApplicationSupplement(appSuppId);

		HighLevelPlan highLevelPlan = appSupp.getHighLevelPlans().get(0);
		Map<String, DataItem> fields = highLevelPlan.getFields();

		Set<Map.Entry<String, DataItem>> set = fields.entrySet();
		Iterator<Map.Entry<String, DataItem>> iteratorEntry = set.iterator();
		while (iteratorEntry.hasNext()) {
			Map.Entry<String, DataItem> entry = (Map.Entry<String, DataItem>) iteratorEntry.next();
			logger.debug("label:" + entry.getKey());

			DataItem appSuppData = entry.getValue();

			logger.debug("appSuppData:" + appSuppData.getStringValue());
			if (entry.getKey().equals("direction"))
				highLevelPlan.setDirection(appSuppData.getStringValue());

		}

		highLevelPlan.setDirection("testing again...");

		this.appSuppService.save(appSupp);
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
