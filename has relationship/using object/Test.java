public class Test{

public static void main(String[]args){

	College c=new College();
	//	c.cid=101;
	//	c.cname="MIT WPU";

	University u=new University();
		u.uid=111;
		u.uname="Private";

	u.college=c;

	System.out.println(u.uid);
	System.out.println(u.uname);

	//type3
	u.college.cid=101;
	u.college.cname="MIT";

	System.out.println(u.college.cid);
	System.out.println(u.college.cname);


	
	//type1
	//directly print using u.college.
	//System.out.println(u.college.cid);
	//System.out.println(u.college.cname);


		
	//type2
	//create object c1 and assign u.college and print using c1.
	//College c1=u.college;
	//System.out.println(c1.cid);
	//System.out.println(c1.cname);
	

	}
}