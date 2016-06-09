package appsupp.dao;

import appsupp.module.ApplicationSupplement;

public class AppSuppDao extends AbstractSpringHibernateDao implements
		AppSuppDaoInterface {

	public void save(ApplicationSupplement appSuppBean) {
		this.getHibernateTemplate().getSessionFactory().getCurrentSession()
				.persist(appSuppBean);
	}

	public void saveWork(ApplicationSupplement appSuppBean) {
		this.getHibernateTemplate().save(appSuppBean);

	}

}
