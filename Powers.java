public class Powers{

	public int Square(){
		int i=10*10;
		
		return i;
	}
	
	public double doublecube(){
		double k=20*20*20;
	
		return k;
	}

	public long longfactorial(){
		long l=1*2*3*4*5*6*7*8;
		
		return l;
	}

		
	public static void main(String[]args){
		
	Powers p=new Powers();
	
	int sq=p.Square();
	System.out.println(sq);

	double cb=p.doublecube();
	System.out.println(cb);

	long fact=p.longfactorial();
	System.out.println(fact);

	}
}