public class Banks{
	 
	String username;
	String bankname;
	String location;
	double accountno;
	String ifsccode;

	public Banks(String username,String bankname, String location,double accountno,String ifsccode){
		
	this.username=username;
	this.bankname=bankname;
	this.location=location;
	this.accountno=accountno;
	this.ifsccode=ifsccode;
	}

	public static void main(String[]args){
		
	Banks b=new Banks("ved dangat","icici bank","kothrud",5352321,"ICICI20101");
	System.out.println("user name= " +b.username);
	System.out.println("bank name="  +b.bankname);
	System.out.println("bank location= " +b.location);
	System.out.println("banck account no= " +b.accountno);
	System.out.println("bank ifsc code=" +b.ifsccode);


	System.out.println("------------------------------------");

	Banks b1=new Banks("soham","bob bank","nigdi",21120021,"bob1d0101");
	System.out.println("user name= " +b1.username);
	System.out.println("bank name="  +b1.bankname);
	System.out.println("bank location= " +b1.location);
	System.out.println("banck account no= " +b1.accountno);
	System.out.println("bank ifsc code=" +b1.ifsccode);

}

}