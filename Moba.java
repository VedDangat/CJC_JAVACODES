public class Moba{

	public Moba(){
		System.out.println("----mobile details for you are here-----");
	}
	

	public Moba(String company, float price){
	
		System.out.println("company of mobile=" +company +" " +"price of mobile=" +price);
	}

	public static void main(String[]args){

		Moba m1=new Moba();

		Moba m2=new Moba("samsung",50000.50f);
		Moba m3=new Moba("iphone",60000.50f);
	}
}