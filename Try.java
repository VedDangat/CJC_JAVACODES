public class Try{

	public void m1(){
	System.out.println("m1 method called");
	}

public static void main(String[]args){
	System.out.println("main method started");
	Try a=new Try();
	

	a.m1();
	a.m1();

	System.out.println("main method ended");
}
}