package BankingApplication;

public abstract class Account implements IBaseRate {
	
	// list of common properties for savings and  current accounts
    private String name; //name of the account holder
	protected String sSN;  //Social security number
	private double balance;
	protected String accountNumber;
	protected double rate; //interest rate 
	private static int index = 10000;
	
	//constructor to set base values and initialize the account
	public Account(String name,String sSN,double initDeposite) {
		
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposite;
		
		
		//set account number
		index++;
		this.accountNumber=setAccountNumber();
		
		//set interest rate
		setRate();
		
	}
	
	public abstract void setRate();

	private String setAccountNumber() {
		
		String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
		int uniqueNumber = index;
		int randomNumber = (int)(Math.random()*Math.pow(10,3));
		
		return lastTwoOfSSN+uniqueNumber+randomNumber;
		
		
	}
	
	//common methods
	public void compound() {
		double accuredInterest = balance * (rate/100);
		balance = balance+accuredInterest;
		System.out.println("Accured Interest is: "+accuredInterest);
		printBalance();
	}
	public void deposite(int amount) {
		balance = balance+amount;
		System.out.println("Your account is deposited with: "+amount);
	}
	public void withdraw(int amount) {
		balance = balance-amount;
	}
	public void transfer(String AccNo,int amount) {
		balance = balance-amount;
		System.out.println("Transfered "+amount+" to the account number "+AccNo);
	}
	public void printBalance() {
		System.out.println("Your Balance is: "+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccount Number: "+accountNumber+
				"\nBalance: "+balance+
				"\nInterest: "+rate+"%"
				);
	}
	
	
	

}
