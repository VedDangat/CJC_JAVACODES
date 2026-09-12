public class Methods{

	public void addition(){    //simple method function
	int num1=30;
	int num2=30;
	System.out.println("addition=" +(num1+num2));
	}
	
	public void subtraction(int num1,int num2){      //parameterized method function
	System.out.println("subtraction=" +(num1-num2));
	}
	
	public void getName(String name){
	System.out.println(name);
	}

	public int multiplication(){    //returntype method function
	int num1=10;
	int num2=20;
	int result=num1*num2;
	return result;
	}

	public int add(int num1,int num2){     //return type and parapeterized method function
	int result=num1+num2;
	return result;
	}



	public static void main(String[]args){

	Methods m=new Methods();
	
	m.addition();

	m.subtraction(100,80);

	m.getName("veddangat");
	
	int resultone=m.multiplication();
	System.out.println(resultone);
	
	int result=m.add(100,200);
	System.out.println(result);
	
	}
}