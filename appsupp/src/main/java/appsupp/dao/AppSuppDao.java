package appsupp.dao;

import appsupp.module.ApplicationSupplement;
import appsupp.module.DomainCode;
import appsupp.module.DomainName;

public class AppSuppDao extends AbstractSpringHibernateDao implements AppSuppDaoInterface {

	public void save(DomainName domainName) {
		this.getHibernateTemplate().getSessionFactory().getCurrentSession().persist(domainName);
	}

	public void save(DomainCode domainCode) {
		this.getHibernateTemplate().getSessionFactory().getCurrentSession().persist(domainCode);
	}

	public void save(ApplicationSupplement appSuppBean) {
		this.getHibernateTemplate().getSessionFactory().getCurrentSession().persist(appSuppBean);
	}

	public void saveWork(ApplicationSupplement appSuppBean) {
		this.getHibernateTemplate().save(appSuppBean);

	}

	public ApplicationSupplement getApplicationSupplement(Integer appSuppId) {
		return (ApplicationSupplement) this.getHibernateTemplate().getSessionFactory().getCurrentSession()
				.get(ApplicationSupplement.class, appSuppId);

	}

}
