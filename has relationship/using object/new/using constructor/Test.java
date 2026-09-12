public class Test{

	public static void main(String []args){

	Product p=new Product(101,"apple");
	Brand b=new Brand(111,"fruit",p);
	Company c=new Company(1,"fruitzzzi",b);


	System.out.println(p.pid);
	System.out.println(p.pname);
	
	
	System.out.println(b.bid);
	System.out.println(b.bname);

	
	System.out.println(c.cid);
	System.out.println(c.cname);

	


	}
}