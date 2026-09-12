public class AAA{

int x;
String y;

public AAA(int x,String y){
this.x=x;
this.y=y;
}

@Override
public String toString(){
return x+ "  " +y;
}

public static void main(String[]args){

AAA a=new AAA(101,"VED");
System.out.println(a);

}
}