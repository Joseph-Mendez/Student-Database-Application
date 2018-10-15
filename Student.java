package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("Class Level Codes: \n1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter Student Class Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + "" + studentID);	
	}
	
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	public void enroll() {
		do {
			
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q") || !course.equals("q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;	
			}
			else {
				break;
				
			}
		} while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
		
	}

}
