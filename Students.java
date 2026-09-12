public class Students{
	int rollno;
	String name;
	String sirname;
	int age;
	float marks; // Fixed the spelling mistake here
	char grades;
	String address;

	public void registerForCourse(){
	System.out.println("yes he had registered for course");
	}

	public void attendClasses(){
	System.out.println("yes he attends classes regurly");
	}
	
	public void dropCourse(){
	System.out.println("no had not dropped course");
	}
	 
	public static void main(String[]args){
	 
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();

		s1.rollno=101;
		s1.name= "ved";
		s1.sirname="dangat";
		s1.age=21;
		s1.marks=92.80f;
		s1.grades='A';
		s1.address="PUNE MAHARASHTRA";
		System.out.println("-----------1st student details--------------");

		System.out.println("roll no of student=" +s1.rollno);
		System.out.println("name of student=" +s1.name);
		System.out.println("sirname of student=" +s1.sirname);
		System.out.println("age of student=" +s1.age);
		System.out.println("marks of student=" +s1.marks);
		System.out.println("grades of student=" +s1.grades);	
		System.out.println("address of student=" +s1.address);

		s1.registerForCourse();
		s1.attendClasses();
		s1.dropCourse();

		System.out.println();

		
		s2.rollno=102;
		s2.name= "soham";
		s2.sirname="hanvate";
		s2.age=21;
		s2.marks=85.91f;
		s2.grades='B';
		s2.address="MUMBAI MAHARASHTRA";
		System.out.println("-----------2st student details--------------");

		System.out.println("roll no of student=" +s2.rollno);
		System.out.println("name of student=" +s2.name);
		System.out.println("sirname of student=" +s2.sirname);
		System.out.println("age of student=" +s2.age);
		System.out.println("marks of student=" +s2.marks);
		System.out.println("grades of student=" +s2.grades);	
		System.out.println("address of student=" +s2.address);
		
		s2.registerForCourse();
		s2.attendClasses();
		s2.dropCourse();

		System.out.println();
		
				
		s3.rollno=103;
		s3.name= "siddhant";
		s3.sirname="bhange";
		s3.age=20;
		s3.marks=84.82f;
		s3.grades='B';
		s3.address="NASHIK MAHARASHTRA";
		System.out.println("-----------3st student details--------------");

		System.out.println("roll no of student=" +s3.rollno);
		System.out.println("name of student=" +s3.name);
		System.out.println("sirname of student=" +s3.sirname);
		System.out.println("age of student=" +s3.age);
		System.out.println("marks of student=" +s3.marks);
		System.out.println("grades of student=" +s3.grades);	
		System.out.println("address of student=" +s3.address);
		
		s3.registerForCourse();
		s3.attendClasses();
		s3.dropCourse();

	}
}
