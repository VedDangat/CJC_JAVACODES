public class Student{

	byte imgsize=10;
	short age=21;
	int rollno= 138;
	long mobno= 1234567890l;
	float marks=92.80f;
	double pocketmoney= 50000.50d;
	char grades='A';
	boolean isMarried;
	
	String name="VEDDANGAT";


public static void main(String[]args){
	Student s=new Student();
	System.out.println("*****Student Info******");
	System.out.println();
	System.out.println("image size of student=" +s.imgsize);
	System.out.println("age of student=" +s.age);
	System.out.println("roll no of student=" +s.rollno);
	System.out.println("mobno of sttudent= " +s.mobno);
	System.out.println("pocketmoney of student= "+s.pocketmoney);
	System.out.println("grades of student= "+s.grades);
	System.out.println("is he married=" +s.isMarried);
	System.out.println("name of student=" +s.name);
}
}