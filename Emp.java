public class Emp{

	public Emp(int empid, String empname){
		System.out.println("----emp details----");
		System.out.println("emp id=" +empid +" " +"empname=" +empname);
	}
	
	public static void main(String[]args){
		 
		Emp e1=new Emp(101,"veddangat");
		Emp e2=new Emp(102,"sohamhanvate");
	}
}