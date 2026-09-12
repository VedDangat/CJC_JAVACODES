public class C{

	public void Demo(){
		System.out.println("this is simple function");
	}


	public C(){
		System.out.println("this is non parameterized constructor");
	}
	
	public C(int age, String name){
		System.out.println("this is parameterized constructor");
		System.out.println("age=" +age +" " +"name=" +name);
	}

	public static void main(String[]args){
	
	C c=new C();
	c.Demo();
	C c1=new C(21,"VED");
	}
}