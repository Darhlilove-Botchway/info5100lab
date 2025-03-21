// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package BMO;

import java.util.*;

/************************************************************/
/**
 * 
 */
public class LargeBusiness extends Adult {
	/**
	 * 
	 */
	private String ceo;
	/**
	 * 
	 */
	private Set<List<String>> boardOfDirectors;
	/**
	 * 
	 */
	private Set<List<String>> nameAndDesignationOfSignatories;
	/**
	 * 
	 */
	private String taxIdentificationNumber;
	/**
	 * 
	 */
	private byte[] identityVerificationDocumentsOfSignatories;
	/**
	 * 
	 */
	private byte[] photoSampleOfSignatures;
	/**
	 * 
	 */
	private String sectorOfBusiness;
	/**
	 * 
	 */
	private byte[] businessResolution;
	
	/**
	 * Methods
	 */
	public void verifyClientInfo() {
	}
	
	/**
	 * Getters and Setters
	 */
	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


	public Set<List<String>> getBoardOfDirectors() {
		return boardOfDirectors;
	}


	public void setBoardOfDirectors(Set<List<String>> boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}


	public Set<List<String>> getNameAndDesignationOfSignatories() {
		return nameAndDesignationOfSignatories;
	}


	public void setNameAndDesignationOfSignatories(Set<List<String>> nameAndDesignationOfSignatories) {
		this.nameAndDesignationOfSignatories = nameAndDesignationOfSignatories;
	}


	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}


	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}


	public byte[] getIdentityVerificationDocumentsOfSignatories() {
		return identityVerificationDocumentsOfSignatories;
	}


	public void setIdentityVerificationDocumentsOfSignatories(byte[] identityVerificationDocumentsOfSignatories) {
		this.identityVerificationDocumentsOfSignatories = identityVerificationDocumentsOfSignatories;
	}


	public byte[] getPhotoSampleOfSignatures() {
		return photoSampleOfSignatures;
	}


	public void setPhotoSampleOfSignatures(byte[] photoSampleOfSignatures) {
		this.photoSampleOfSignatures = photoSampleOfSignatures;
	}


	public String getSectorOfBusiness() {
		return sectorOfBusiness;
	}


	public void setSectorOfBusiness(String sectorOfBusiness) {
		this.sectorOfBusiness = sectorOfBusiness;
	}


	public byte[] getBusinessResolution() {
		return businessResolution;
	}


	public void setBusinessResolution(byte[] businessResolution) {
		this.businessResolution = businessResolution;
	}
}
