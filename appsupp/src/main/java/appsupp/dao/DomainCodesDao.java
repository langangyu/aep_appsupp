package appsupp.dao;

import appsupp.module.DomainCode;

public class DomainCodesDao extends AbstractSpringHibernateDao implements
		DomainCodesDaoInterface {

	@Override
	public DomainCode getDomainCode(final int domainCodeId) {
		return super.getDomainCode(domainCodeId);
	}

}
