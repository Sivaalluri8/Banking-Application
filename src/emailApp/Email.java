package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private String companysuffex = "spacex.com";  
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String email;
	
	//creating constructor for receiving first name and the last name
	public Email(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		
		// call the setdepartment method to get the department
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
		// generate a random password of default length
		this.password = randomPassword(this.defaultPasswordLength);
		
		
		// generating the email using all the fields
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffex; 
		
	}
    
	// creating method to set the department
	private String setDepartment() {
		System.out.println("Department Codes\n1 for salse\n2 for development\n3 for accounting\n0 for none\nEnter the code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return "";}
	}
	
	// creating method to generate a randompassword
	private String randomPassword(int defaultPasswordLength) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&";
		char password[] = new char[defaultPasswordLength];
		for(int i=0; i<defaultPasswordLength; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// set mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	// set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// get methods 
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	// get the required info to be displayed
	public String getInfo() {
		return "worker details:"+
				"\nName: "+firstname+lastname+
				"\nCompany mail: "+email+
				"\nMailbox capacity: "+mailBoxCapacity+
				"\nPassword: "+password;
		        
	}
	

}
