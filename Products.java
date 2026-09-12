public class Products{

	public void details(String name, String model){
		System.out.println(name);
		System.out.println(model);
	}
	
	public void Configuration(int ram, int rom){
		System.out.println(ram);
		System.out.println(rom);
	}
	
	public void purches(double price, String location){
		System.out.println(price);
		System.out.println(location);

		System.out.println("price =" +price + " " + "location=" +location);
	}

	
	public static void main(String[]args){

	Products p=new Products();
	
	System.out.println("----1st product-----");
	p.details("motorola","neomodel");
	p.Configuration(12,128);
	p.purches(15000,"pune");

	System.out.println("------2nd product-----");
	p.details("samsung","smodel");
	p.Configuration(12,256);
	p.purches(17000,"mumbai");

	}
}