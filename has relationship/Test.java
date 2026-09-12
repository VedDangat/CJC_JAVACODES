public class Test{
	public static void main(String[]args){
	
	Employee e=new Employee();
		e.setEid(101);		
		e.setEname("ved");

	Department d=new Department();
		d.setDid(1);
		d.setDname("IT");

	e.setDepartment(d);
	
	int eid=e.getEid();
	System.out.println(eid);
	String name=e.getEname();
	System.out.println(name);

	e.getDepartment();
	int did=d.getDid();
	System.out.println(did);
	String dname=d.getDname();	
	System.out.println(dname);
	}
}