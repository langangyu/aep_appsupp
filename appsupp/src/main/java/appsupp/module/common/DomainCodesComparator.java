package appsupp.module.common;

import java.util.Comparator;

import appsupp.module.DomainCode;

public class DomainCodesComparator implements Comparator<DomainCode> {
	@Override
	public int compare(DomainCode d1, DomainCode d2) {
		return d1.getDescription().compareTo(d2.getDescription());
	}
}

