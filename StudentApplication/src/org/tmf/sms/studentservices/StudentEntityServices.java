package org.tmf.sms.studentservices;
public class StudentEntityServices {
 private long id;
 private String name;
 private int age;
 private String qualfication;
 private String gender;
 private String email;
 private long phonenumber;
 private String password;
 private String courseStatus;
 public StudentEntityServices(long id,String name,int age,String qualfication,String gender,String email,long phonenumber,String password,String courseStatus) {
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 this.qualfication=qualfication;
	 this.gender=gender;
	 this.email=email;
	 this.phonenumber=phonenumber;
	 this.password=password;
	 this.courseStatus=courseStatus;
 }
}
