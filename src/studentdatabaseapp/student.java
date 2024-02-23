package studentdatabaseapp;

import java.util.Scanner;

public class student {
	
	private String firstname;
	private String lastname;
	private int gradYear;
	private String studentId;
	private String courses = "";
	private int noOfCourses = 0;
	private int tuitionBalance = 5000;
	private static int tuitionFee = 0;
	private static int courseFee = 2000;
	private static int id = 1000;
	
	// constructor: asks user to enter the name and year of the student
	
	public student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student's First name: ");
		this.firstname = sc.nextLine();
		System.out.println("Enter the student's last name: ");
		this.lastname = sc.nextLine();
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter the gradYear");
		this.gradYear = sc.nextInt();
		
		setStudentId();
		
	}
    
	//Generate student Id
	private void setStudentId() {
		id++;
		// StudentId = gradyear+id
		this.studentId = gradYear+""+id;
		
	}
	
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter the course to enroll(Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
		
			if(!course.equals("Q")) {
				this.courses = courses+"\n-->"+course;
				noOfCourses++;
				tuitionFee+=courseFee;
			}
			else {
				break;
			}
		}
		while(noOfCourses<=3);
		
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your tuition balance is: Rs "+tuitionBalance);
	}
	
	//pay tuition fee
	public void payTuitionfee() {
		System.out.print("Enter the payment: Rs ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance-=payment;
		System.out.println("Thank you for the payment of: RS "+payment);
		viewBalance();
	
	}
	
	//show status
	public String studentDetails() {
		return "Name : "+firstname+" "+lastname+
				"\nGrade: "+gradYear+
				"\nStudet ID: "+studentId+
				"\nCourses Enrolled: "+courses+
				"\nTuition Fee: "+tuitionFee+
				"\nTuition Balance: "+tuitionBalance;
	}

}
