public class Test{

	public static void main(String[]args){
	
	Hospital h=new Hospital();
		h.setHid(101);
		h.setHname("new hospital");

	Doctor d=new Doctor();
		d.setDid(1001);
		d.setDname("rohan");

	h.setDoctor(d);	
	
	int hid=h.getHid();
	System.out.println(hid);
	String hname=h.getHname();
	System.out.println(hname);

	h.getDcotor();
	int did=d.getDid();
	System.out.println(did);
	String dname=d.getDname();
	System.out.println(dname);
	

	Specilization s=new Specilization();
		s.setSid(1010);
		s.setField("neurologist");
	
	d.setSpecilization(s);

	d.getSpecilization();
	int sid=s.getSid();
	System.out.println(sid);
	String field=s.getField();
	System.out.println(field);

	}
}
