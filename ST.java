public class ST{

	int rollno;
	String name;

	public ST(int r,String n){
		rollno=r;
		name=n;
	}
	
	public static void main(String[]args){
	
		ST s1=new ST(101,"ved dangat");
		System.out.println("roll no =" +s1.rollno +"  " +"name= " +s1.name);
	
	}

}
