public class Car{
	String name;
	int fuleCapacity;
	String model;
	boolean sunRoof;
	String soundSystem;

public void start(){
	System.out.println("car is starting");
}

public void haveAc(){
	System.out.println("car has ac also");
}

public void drive(){
	System.out.println("car is dirven automatically");
}

public static void main(String[]args){

	Car c1=new Car();
	Car c2=new Car();
	

	c1.name="kia";
	c1.fuleCapacity=35;
	c1.model="seltos";
	c1.sunRoof=true;
	c1.soundSystem="jbl";
	

	c2.name="tata";
	c2.fuleCapacity=34;
	c2.model="thar";
	c2.sunRoof=false;
	c2.soundSystem="sony";

	System.out.println("-----------------car1 details-----------------");
	System.out.println("car name=" +c1.name);
	System.out.println("car fule capacity=" +c1.fuleCapacity);
	System.out.println("car model name=" +c1.model);
	System.out.println("car has sunroof t/f" +c1.sunRoof);
	System.out.println("car sound system name=" +c1.soundSystem);

	c1.start();
	c1.haveAc();
	c1.drive();
	
	System.out.println();

	System.out.println("---------------car2 details-------------------");
	System.out.println("car name=" +c2.name);
	System.out.println("car fule capacity=" +c2.fuleCapacity);
	System.out.println("car model name=" +c2.model);
	System.out.println("car has sunroof t/f" +c2.sunRoof);
	System.out.println("car sound system name=" +c2.soundSystem);

	c2.start();
	c2.haveAc();
	c2.drive();

}
}