public class Employee{

	private int eid;
	private String ename;
	private Department dep;

	public void setEid(int eid){
	this.eid=eid;
	}
	public int getEid(){
	return eid;
	}

	public void setEname(String ename){
	this.ename=ename;
	}
	public String getEname(){
	return ename;
	}

	public void setDepartment(Department dep){
	this.dep=dep;
	}
	public Department getDepartment(){
	return dep;
	}
}