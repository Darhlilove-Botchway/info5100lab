// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package BMO;

import java.util.List;

/************************************************************/
/**
 * 
 */
public abstract class Client extends Entity {
	/**
	 * 
	 */
	public String identityVerificationDocumentType;
	/**
	 * 
	 */
	public String identityVerificationDocumentId;
	/**
	 * 
	 */
	public byte[] photoOfVerificationDocument;
	/**
	 * 
	 */
	public byte[] photoSampleOfSignatures;

	/**
	 * 
	 */
	public void verifyClientInfo() {
	}
	
	public void addSavingsAccount(Saving account) {
	}
	
	public void removeSavingsAccount(Saving account) {
	}
	
	public void listBankAccounts(List<BankAccount> bankAccounts) {
	}	
}
