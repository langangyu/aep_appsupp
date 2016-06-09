package appsupp.module;

import java.sql.Timestamp;
import java.util.Date;

public class Reservation implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer reservationId;
	private DomainCode domainCodeReservationType;
	private String reservationNumber;
	private DomainCode domainCodePurposeCode;
	private DomainCode domainCodeRestrictionCode;
	private Boolean contactRequired;
	private Date dateContact;
	private String responseReceived; // Y / N / N/A
	private String concernsNoted; // Y / N / N/A
	private String concernsAccommodated; // Y / N / N/A
	private String applicationOptions; // maybe domain code?
	private int rowNumber;
	private String createUserid;
	private Timestamp createTimestamp;
	private String updateUserid;
	private Timestamp updateTimestamp;
	
	public Reservation() {
		
	}
	
	public Integer getReservationId() {
		return reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public DomainCode getDomainCodeReservationType() {
		return domainCodeReservationType;
	}

	public void setDomainCodeReservationType(DomainCode domainCodeReservationType) {
		this.domainCodeReservationType = domainCodeReservationType;
	}

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public DomainCode getDomainCodePurposeCode() {
		return domainCodePurposeCode;
	}

	public void setDomainCodePurposeCode(DomainCode domainCodePurposeCode) {
		this.domainCodePurposeCode = domainCodePurposeCode;
	}

	public DomainCode getDomainCodeRestrictionCode() {
		return domainCodeRestrictionCode;
	}

	public void setDomainCodeRestrictionCode(DomainCode domainCodeRestrictionCode) {
		this.domainCodeRestrictionCode = domainCodeRestrictionCode;
	}

	public Boolean getContactRequired() {
		return contactRequired;
	}

	public void setContactRequired(Boolean contactRequired) {
		this.contactRequired = contactRequired;
	}

	public Date getDateContact() {
		return dateContact;
	}

	public void setDateContact(Date dateContact) {
		this.dateContact = dateContact;
	}

	public String getResponseReceived() {
		return responseReceived;
	}

	public void setResponseReceived(String responseReceived) {
		this.responseReceived = responseReceived;
	}

	public String getConcernsNoted() {
		return concernsNoted;
	}

	public void setConcernsNoted(String concernsNoted) {
		this.concernsNoted = concernsNoted;
	}

	public String getConcernsAccommodated() {
		return concernsAccommodated;
	}

	public void setConcernsAccommodated(String concernsAccommodated) {
		this.concernsAccommodated = concernsAccommodated;
	}

	public String getApplicationOptions() {
		return applicationOptions;
	}

	public void setApplicationOptions(String applicationOptions) {
		this.applicationOptions = applicationOptions;
	}
	
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public String getCreateUserid() {
		return createUserid;
	}

	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getUpdateUserid() {
		return updateUserid;
	}

	public void setUpdateUserid(String updateUserid) {
		this.updateUserid = updateUserid;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}
}