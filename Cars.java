public class Cars{

	public Cars(String brand,String model){
		System.out.println("---car details---");
		System.out.println("brand=" +brand +"  " +"model=" +model);
	}
	

	public static void main(String[]args){
	
		Cars c1=new Cars("TATA","PUNCH");
		Cars c2=new Cars("Mahendra","xuv");
		Cars c3=new Cars("Kia","Seltos");
	}
}