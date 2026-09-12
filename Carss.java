public class Carss{

	String name;
	float price;
	String model;
	
	public void Start(){
	System.out.println("yes car start ");	
}
	public void Drive(){
	System.out.println("Car is working and can be driven");
	}

	public static void main(String []args){

	Carss c1=new Carss();
	c1.name="kia";
	c1.price=433535.50f;
	c1.model="seltos";
		
	System.out.println("car details");
	System.out.println(c1.name);
	System.out.println(c1.price);
	System.out.println(c1.model);
	
}
}