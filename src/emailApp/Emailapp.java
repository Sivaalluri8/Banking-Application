package emailApp;

import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the firstname and the last name: ");
		Email em1 = new Email(sc.nextLine() ,sc.nextLine());
	    em1.setMailBoxCapacity(400);
	    
		System.out.println(em1.getInfo());
		
		
		

	}

}
