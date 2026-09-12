public class Test{

public String m1(){
return "VED";
}

public Object m2(){
return "SAM";
}

public Object m3(){
return 121;
}

public static void main(String[]args){

Test test=new Test();

String name=test.m1();
System.out.println(name);

String nm=(String)test.m2();
System.out.println(nm);

int num=(int)test.m3();
System.out.println(num);
}
}