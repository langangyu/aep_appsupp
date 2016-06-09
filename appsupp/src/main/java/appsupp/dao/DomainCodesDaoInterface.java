package appsupp.dao;

import java.util.List;

import appsupp.module.DomainCode;

public interface DomainCodesDaoInterface {

	public Integer getDomainCodeId(String domainName, String domainCode);

	public DomainCode getDomainCode(final int domainCodeId);

	public List<DomainCode> getDomainCodesByDomainName(String domainName);
}
