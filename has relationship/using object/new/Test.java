public class Test{

	public static void main(String[]args){
	
	Product p=new Product();
		p.pid=111;
		p.pname="tshirt";
	
	Brand b=new Brand();
		b.bid=1;
		b.bname="zara";

	Company c=new Company();
		c.cid=101;
		c.cname="zaraaa";

	c.brand=b;

	System.out.println(c.cid);
	System.out.println(c.cname);
	System.out.println(c.brand.bid);
	System.out.println(c.brand.bname);
	
	b.product=p;
	
	System.out.println(b.product.pid);
	System.out.println(b.product.pname);

	
	
	
	
	}
}