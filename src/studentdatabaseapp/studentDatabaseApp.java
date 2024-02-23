package studentdatabaseapp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int noOfStudents = sc.nextInt();
		student[] students = new student[noOfStudents];
		
		for(int i=0; i<noOfStudents; i++) {
			students[i] = new student();
			students[i].enroll();
			students[i].payTuitionfee();
			System.out.println(students[i].studentDetails());
		}
		

	}

}
