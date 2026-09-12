public class OLtry{

public static void main(String[]args){
System.out.println("string main metohd");    //only this main method will get called 

main(100);                                   //now both para-method get called 
main("ved");
}

public static void main(int x){
System.out.println("x method called=" +x);
}

public static void main(String name){
System.out.println("name string method called=" +name);
}

}
