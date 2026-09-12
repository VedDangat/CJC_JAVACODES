public class Doctor{

	private int did;
	private String dname;
	private Specilization spc;

	public void setDid(int did){
	this.did=did;
	}
	public int  getDid(){
	return did;
	}

	public void setDname(String name){
	this.dname=dname;
	}	
	public String getDname(){
	return dname;
	}

	public void setSpecilization(Specilization spc){
	this.spc=spc;
	}
	public Specilization getSpecilization(){
	return spc;	
	}

}