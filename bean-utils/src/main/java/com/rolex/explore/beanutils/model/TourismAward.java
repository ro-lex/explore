package com.rolex.explore.beanutils.model;

public class TourismAward {
	
	private String issuingAuthority;
	
	private String issuingCountry;

	public TourismAward() {
		super();
	}

	public TourismAward(String issuingAuthority, String issuingCountry) {
		super();
		this.issuingAuthority = issuingAuthority;
		this.issuingCountry = issuingCountry;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public String getIssuingCountry() {
		return issuingCountry;
	}

	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
	}

	@Override
	public String toString() {
		return "TourismAward [issuingAuthority=" + issuingAuthority + ", issuingCountry=" + issuingCountry + "]";
	}
	
}
