package appsupp.dao;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import appsupp.App;
import appsupp.module.DomainCode;
import appsupp.module.DomainName;

public abstract class AbstractSpringHibernateDao extends HibernateDaoSupport {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public DomainCode getDomainCode(final int dcId) {
		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createCriteria(DomainCode.class);

		DomainCode domainCodeObject = null;
		criteria.add(Restrictions.eq("domainCodeId", BigDecimal.valueOf(dcId)));

		List<DomainCode> rows = criteria.list();
		if (rows.size() > 0)
			domainCodeObject = (DomainCode) rows.get(0);

		return domainCodeObject;
	}

	public Integer getDomainCodeId(String domainName, String domainCode) {
		DomainCode domainCodeObject = this.getDomainCode(domainName, domainCode);
		if (domainCodeObject != null)
			return domainCodeObject.getDomainCodeId().intValue();
		else
			return null;
	}

	public DomainName getDomainName(String domainName) {
		DomainName dn = null;

		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createCriteria(DomainName.class, "dn");

		criteria.add(Restrictions.eq("dn.domainName", domainName));
		criteria.add(Restrictions.eq("dn.appCode", App.APPLICATION_CODE));

		@SuppressWarnings("unchecked")
		List<DomainName> rows = criteria.list();
		if (rows.size() > 0) {
			dn = rows.get(0);
		}
		return dn;

	}

	public DomainCode getDomainCodeByDesciption(String domainName, String domainCodeDesc) {
		return this.getDomainCode(domainName, domainCodeDesc, false);
	}

	public DomainCode getDomainCode(String domainName, String domainCode) {
		return this.getDomainCode(domainName, domainCode, true);
	}

	private DomainCode getDomainCode(String domainName, String domainCode, boolean searchByDomainCode) {
		List<DomainCode> rows = getDomainCodes(domainName, domainCode, searchByDomainCode);
		DomainCode domainCodeObject = null;
		if (rows.size() > 0)
			domainCodeObject = (DomainCode) rows.get(0);

		return domainCodeObject;
	}

	@SuppressWarnings("unchecked")
	private List<DomainCode> getDomainCodes(String domainName, String domainCode, boolean searchByDomainCode) {
		// get the id for the given domain name + code (string)
		Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createCriteria(DomainCode.class, "dc");

		criteria.createAlias("dc.domainName", "dn");

		criteria.add(Restrictions.eq("dn.domainName", domainName));
		criteria.add(Restrictions.eq("dn.appCode", App.APPLICATION_CODE));
		if (domainCode != null) {
			if (searchByDomainCode)
				criteria.add(Restrictions.eq("code", domainCode));
			else
				criteria.add(Restrictions.eq("description", domainCode));
		}
		criteria.addOrder(Order.asc("description"));

		List<DomainCode> rows = criteria.list();
		return rows;
	}

	public List<DomainCode> getDomainCodesByDomainName(String dnName) {

		return this.getDomainCodes(dnName, null, false);

	}

	public void flush() {
		getHibernateTemplate().getSessionFactory().getCurrentSession().flush();

	}

	public void commitTransaction() {
		getHibernateTemplate().getSessionFactory().getCurrentSession().getTransaction().commit();

	}

	public void rollbackTransaction() {
		getHibernateTemplate().getSessionFactory().getCurrentSession().getTransaction().rollback();
	}

	public void beginTransaction() {
		getHibernateTemplate().getSessionFactory().getCurrentSession().getTransaction().begin();
	}

	public void closeCurrentSession() {
		getHibernateTemplate().getSessionFactory().getCurrentSession().close();
	}

}