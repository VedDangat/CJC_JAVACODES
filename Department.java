public class Department{

	int id=101;                       //instance varibale ie global variable
	String name="CSE";
	String location="NORTH";
	
		public void displayDepartment(){
			int id=102;                       //local variable
			String name="CIVIL";
			String location="EAST";
			
			System.out.println("id=" +id);
			System.out.println("name=" +name);
			System.out.println("location=" +location);
		}

public static void main(String[]args){
	Department dept=new Department();
	
	System.out.println("id=" +dept.id);
	System.out.println("name=" +dept.name);
	System.out.println("location=" +dept.location);
	
	dept.displayDepartment();
}
}