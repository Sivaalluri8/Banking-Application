package BankingApplication;

import java.util.Scanner;

public class Current extends Account {
	
	//list properties specific to the current account
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize current account
	public Current(String name,String sSN,double initDeposite) {
		super(name,sSN,initDeposite);
		accountNumber = "2"+accountNumber;
		
		//setting the debit card 
		setDeditCard();
	
	}
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
		
	}
	
	
	//list any methods specific to the current account
	
	private void setDeditCard() {
		debitCardNumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPin = (int)(Math.random()*Math.pow(10,4));
		
	}
	protected void reSetDebitCardPin() {
		System.out.println("Enter the new 4 digit pin: ");
		Scanner sc = new Scanner(System.in);
		this.debitCardPin = sc.nextInt();
		System.out.println("Your debit card pin is reset now.");
	}
	

	public void showInfo() {
		System.out.println("Account Type: Current");
		super.showInfo();
		System.out.println("Current Account features:"+
		"\n Debit Card Number: "+debitCardNumber+
		"\n Debit Card Pin: "+debitCardPin);
		
	}


	

}
