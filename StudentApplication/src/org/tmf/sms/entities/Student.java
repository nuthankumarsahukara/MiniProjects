
package org.tmf.sms.entities;


public class Student {
	//Data members
	private long studentId;
	private String studentName;
	private long studentPhoneNumber;
	
	//All args Constructor
	public Student(long studentId,String studentName,long studentPhoneNumber)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
	}
	
	//Overrding:
	//Modify a method which is existing in a parent class
	public String toString() {
		return "student info [studentId : "+this.studentId
				+", studentName : "+this.studentName
				+", studentPhone : "+this.studentPhoneNumber+"]";
	}
}