public class Empl{

	int employeeid;
	String empname;
	String empdept;

	public Empl(int eid , String ename , String edept){
	
	employeeid= eid;
	empname= ename;
	empdept= edept;
	
	}

	public static void main(String[]args){

	Empl emp=new Empl(101,"VED","CSE");

	System.out.println("employee id=" +emp.employeeid );
	System.out.println("employee name=" +emp.empname);
	System.out.println("employee dept=" +emp.empdept);

	System.out.println("-----------------------------");

	Empl emp2=new Empl(102,"soham","cyber");

	System.out.println("employee id=" +emp2.employeeid );
	System.out.println("employee name=" +emp2.empname);
	System.out.println("employee dept=" +emp2.empdept);

	}
}