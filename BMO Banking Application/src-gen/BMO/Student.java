// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package BMO;

/************************************************************/
/**
 * 
 */
public class Student extends Client {
	/**
	 * 
	 */
	private String nameOfSchool;
	/**
	 * 
	 */
	private byte[] schoolIdentityDocument;


	/**
	 * Getters and Setters
	 */
	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public byte[] getSchoolIdentityDocument() {
		return schoolIdentityDocument;
	}

	public void setSchoolIdentityDocument(byte[] schoolIdentityDocument) {
		this.schoolIdentityDocument = schoolIdentityDocument;
	}
	
	/**
	 * Methods
	 */
	@Override
	public void verifyClientInfo() {
	}
	
	public void addCheckingAccount(Checking account) {
	}
	
	public void removeCheckingAccount(Checking account) {
	}
}
