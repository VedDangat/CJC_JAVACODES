public class NewStudent{

	byte imgsize;
	short age;
	int rollno;
	long mobno;
	float marks;
	double pocketmoney;
	char grades;
	boolean isMarried;
	
	String name;


public static void main(String[]args){
	NewStudent ns=new NewStudent();
	System.out.println("*****Student Info******");
	System.out.println();
	System.out.println("image size of student=" +ns.imgsize);
	System.out.println("age of student=" +ns.age);
	System.out.println("roll no of student=" +ns.rollno);
	System.out.println("mobno of sttudent= " +ns.mobno);
	System.out.println("pocketmoney of student= "+ns.pocketmoney);
	System.out.println("grades of student= "+ns.grades);
	System.out.println("is he married=" +ns.isMarried);
	System.out.println("name of student=" +ns.name);
}
}
