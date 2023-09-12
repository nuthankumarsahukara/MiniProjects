package org.tmf.sms.app;
import java.util.Scanner;

import org.tmf.sms.entities.Student;
import org.tmf.sms.studentservices.StudentEntityServices;

public class StudentEntity {
	private Scanner scan = new Scanner(System.in);
	private StudentEntityServices studentss[] = new StudentEntityServices[10];
	private long studentId=10000001;
	private int index = 0;
	public void studentMenu() {
		while(true) {
		System.out.println("================================================");
		System.out.println("**************Student Monitoring System**********");
		System.out.println("================================================");
		System.out.println("Press 1 for Add new Student Details");
		System.out.println("Press 2 for Display all available students");
		System.out.println("Press 3 for Display student by ID");
		System.out.println("Press 4 for Update Student Details");
		System.out.println("Press 5 for Delete Student by Id");
		System.out.println("Press 9 for Exit");
		System.out.println("Please Enter your Choice....");
		int option = scan.nextInt();
		
		switch(option) {
		case 1 : addNewStudentDetails();break;
		case 2 : displayAllStudentsDetails();break;
		case 3 : displayStudentByIdDetails();break;
		case 4 : updateStudentByIdDetails();break;
		case 5 : deleteStudentByIdDetails();break;
		case 9 : System.exit(0);
		default : System.out.println("Please choose a correct options");
		}
		}
	}
	private void deleteStudentByIdDetails() {
		// TODO Auto-generated method stub
		
	}
	private void updateStudentByIdDetails() {
		// TODO Auto-generated method stub
		
	}
	private void displayStudentByIdDetails() {
		// TODO Auto-generated method stub
		
	}
	private void displayAllStudentsDetails() {
		// TODO Auto-generated method stub
		
	}
	private void addNewStudentDetails() {
		if(index>=studentss.length) {
			System.out.println("Sorry!.. Student data not filled...");
		}
		else {
			//Accepting data from the user
			System.out.println("Enter the Name of the student ");
			String name = scan.next();
			System.out.println("Enter the student Age ");
			int age = scan.nextInt();
			System.out.println("Enter the student Qualfication ");
			String qualfication = scan.next();
			System.out.println("Enter the student Gender");
			String gender = scan.next();
			System.out.println("Enter the student email");
			String email = scan.next();
			System.out.println("Enter the student Phone number ");
			long phonenumber = scan.nextLong();
			System.out.println("Create the Password ");
			String password = scan.next();
			System.out.println("Enter the student Course ");
			String courseStatus  = scan.next();
			
			//Create a student object then pass the data
			StudentEntityServices st1 = new StudentEntityServices(studentId,name,age,qualfication,gender,email,phonenumber,password,courseStatus);
			
			//Add the new student object to the array.
			studentss[index] = st1;
			
			//Increase the Id and index after adding a new student.
			studentId++;
			index++;
		}
		
	}
}
