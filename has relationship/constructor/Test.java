public class Test{

	public static void main(String[]args){
	
	Department d=new Department(101,"IT");
	System.out.println(d.did);
	System.out.println(d.dname);

	Employee e=new Employee(111,"VED",d);
	System.out.println(e.eid);
	System.out.println(e.ename);
		
	}
}