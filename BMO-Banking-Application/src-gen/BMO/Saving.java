// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package BMO;

/************************************************************/
/**
 * 
 */
public class Saving extends BankAccount {
	/**
	 * 
	 */
	private String nickName;
	/**
	 * 
	 */
	private Float interestRate;

	/**
	 * Getters and Setters
	 */
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return "Savings Bank Account [Account ID: " + bankAccountId + "]";
	}
}
