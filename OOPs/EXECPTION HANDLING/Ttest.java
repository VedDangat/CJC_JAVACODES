public class Ttest{
public  static void main(String[]args){

int arr[]={10,20,30,40};

try{
System.out.println("this 6th posittion of index contains=" +arr[6]);
}

catch(ArrayIndexOutOfBoundsException e){
System.out.println("arry not contain 6th position so retrive impossible");
}

finally{
System.out.println("final block of code eexecuted");
}


}
}