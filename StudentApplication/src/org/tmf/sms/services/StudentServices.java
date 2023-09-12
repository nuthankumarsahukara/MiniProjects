package org.tmf.sms.services;

import java.util.Scanner;

import org.tmf.sms.entities.Student;

public class StudentServices {
	private Scanner scan = new Scanner(System.in);
	private Student students[] = new Student[10];
	private long studentId=10000001;
	private int index = 0;
	
	public void menu() {
		while(true) {
		System.out.println("================================================");
		System.out.println("**************Student Monitoring System**********");
		System.out.println("================================================");
		System.out.println("Press 1 for Add new Student");
		System.out.println("Press 2 for Display all available students");
		System.out.println("Press 3 for Display student by ID");
		System.out.println("Press 4 for Update Student Details");
		System.out.println("Press 5 for Delete Student by Id");
		System.out.println("Press 9 for Exit");
		System.out.println("Please Enter your Choice....");
		int option = scan.nextInt();
		
		switch(option) {
		case 1 : addNewStudent();break;
		case 2 : displayAllStudents();break;
		case 3 : displayStudentById();break;
		case 4 : updateStudentById();break;
		case 5 : deleteStudentById();break;
		case 9 : System.exit(0);
		default : System.out.println("Please choose a correct options");
		}
		}
	}

	private void deleteStudentById() {
		// TODO Auto-generated method stub
		System.out.println("Delete function has called");
	}

	private void updateStudentById() {
		// TODO Auto-generated method stub
		System.out.println("update function has called");
	}

	private void displayStudentById() {
		// TODO Auto-generated method stub
		System.out.println("Display Student by id called");
		
	}

	private void displayAllStudents() {
		// TODO Auto-generated method stub
		System.out.println("Display All students function has called");
		if(index==0) {
			System.out.println("No admission takes place.");
		}
		else {
			for(int i=0;i<index;i++) {
				System.out.println(students[i]);
			}
		}
	}

	private void addNewStudent() {
		// TODO Auto-generated method stub
		System.out.println("Add New Student Function has called");
		
		if(index>=students.length) {
			System.out.println("Sorry!.. Admissions got closed...");
		}
		else {
			//Accepting data from the user
			System.out.println("Enter the Name of the student ");
			String name = scan.next();
			System.out.println("Enter the student Phone number ");
			long phone = scan.nextLong();
			
			//Create a student object then pass the data
			Student st = new Student(studentId,name,phone);
			
			//Add the new student object to the array.
			students[index] = st;
			
			//Increase the Id and index after adding a new student.
			studentId++;
			index++;
		}
	}
}









