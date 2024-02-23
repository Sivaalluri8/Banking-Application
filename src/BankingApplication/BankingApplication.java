package BankingApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		
		
		Current sav = new Current("Varma","543678901",50000);
		sav.showInfo();
		sav.reSetDebitCardPin();
		
		/*
		List<Account> accounts = new LinkedList<Account>();
		
		//reading a csv file then creat new accounts based on that data 
		String file = "C:\\Users\\allur\\Downloads\\NewBankAccounts (2).csv";
	
		List<String[]> newAccountHolders = utilities.csv.read(file);
		
		for(String[] accountHolders : newAccountHolders) {
			
			String name = accountHolders[0];
			String sSN = accountHolders[1];
			String accountType = accountHolders[2];
			double initDeposite = Double.parseDouble(accountHolders[3]);
			
			if(accountType.equals("Savings")) {
				
				accounts.add(new Savings(name,sSN,initDeposite));
			}
			else if(accountType.equals("Checking")) {
				
				accounts.add(new Current(name,sSN,initDeposite));
		    }
			else {
				System.out.println("Error reading account type");
			}
		}
		
		
		for(Account acc : accounts) {
			
				acc.showInfo();
				System.out.println("------------------------------");
			
		}*/

	}
}


