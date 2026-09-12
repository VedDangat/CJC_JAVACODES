public class Hospital{

	private int hid;
	private String hname;
	private Doctor dr;

	public void setHid(int hid){
	this.hid=hid;
	}
	public int getHid(){
	return hid;
	}

	public void setHname(String hname){
	this.hname=hname;
	}
	public String getHname(){
	return hname;
	}

	public void setDoctor(Doctor dr){
	this.dr=dr;
	}
	public Doctor getDcotor(){
	return dr;
	}
}