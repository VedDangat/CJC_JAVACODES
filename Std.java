
public class Std{

	int rollno;
	String name;

	public Std(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public static void main(String[]args){
	
		Std s1=new Std(101,"ved dangat");
		System.out.println("roll no =" +s1.rollno +"  " +"name= " +s1.name);
	
	}

}
