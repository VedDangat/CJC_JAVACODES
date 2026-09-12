public class Brand{
	int id=101;
	String name="zara";
	String model="tshirts";

public void displayBrand(){
	int id=102;
	String name="h&m";
	String model="pants";
	
	System.out.println("id of brand=" +id);
	System.out.println("name of brand=" +name);
	System.out.println("model of brand=" +model);
}


public static void main(String[]args){
	
Brand bd=new Brand();

	bd.displayBrand();

	System.out.println("brand id=" +bd.id);
	System.out.println("brand name=" +bd.name);
	System.out.println("brand model=" +bd.model);
}
}
