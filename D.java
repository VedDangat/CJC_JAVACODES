public class D{

	public void Demomethod(){
		System.out.println("this is demo method");
	}

	public D(){
		System.out.println("this is non perameterized constructor");
	}
	
	public D(int age,String name){
		System.out.println("this is parameterized constructor");
		System.out.println("age=" +age +" " +"name=" +name);
	}

	public D(String name, int age){
		System.out.println("parameterized const");
		System.out.println("name=" +name +" " +"age=" +age);
	}
	
	public D(float marks, double phoneno){
		System.out.println("marks=" +marks +" " +"phoneno=" +phoneno);
	}

	public static void main(String[]args){
	
		D d=new D();
		d.Demomethod();

		D d1=new D();
		D d2=new D(20,"VED DANGAT");
		D d3=new D("ASHISH KARDILE",19);
		D d4=new D(93.80f,2324444.20);
	}
}