package appsupp.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import appsupp.module.DomainCode;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-resources.xml" })
@TransactionConfiguration(defaultRollback = false)
public class DomainCodesDaoTest {

	@Autowired
	@Qualifier(value = "domainCodesDao")
	DomainCodesDaoInterface domainCodeDao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Transactional
	public void testGetDomainCodeId() {
		Integer domaincodeId = this.domainCodeDao.getDomainCodeId("ATS_QUARTR",
				"6");
		assertEquals(domaincodeId.intValue(), 74311);

	}

	@Test
	@Transactional
	public void testGetDomainCodes() {
		List<DomainCode> quarters = this.domainCodeDao
				.getDomainCodesByDomainName("ATS_QUARTR");
		assertEquals(4, quarters.size());

	}

}
