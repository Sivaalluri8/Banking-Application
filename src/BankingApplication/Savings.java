package BankingApplication;

public class Savings extends Account {
	
	//list properties specific to the savings account
	private int safetyDepositeBoxID;
	private int safetyDepositeBoxKey;
	
	//constructor to initialize savings account
	public Savings(String name,String sSN,double initDeposite) {
		super(name,sSN,initDeposite);
		accountNumber = "1"+accountNumber;
		setSafetyDepositeBox();
		
		
	}
	@Override
	public void setRate() {
		rate = getBaseRate()-.25;
		
	}
	
		
	//list any methods specific to the savings account
	
	private void setSafetyDepositeBox() {
		safetyDepositeBoxID = (int)(Math.random()*Math.pow(10,3));
		safetyDepositeBoxKey = (int)(Math.random()*Math.pow(10,4));
		
	}

	public void showInfo() {
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				"Savaings Account features: "
				+ "\n Safety Deposite Box ID: "+safetyDepositeBoxID+
				"\n Safety deposite Box key: "+safetyDepositeBoxKey
				);
		
	}


	

}
