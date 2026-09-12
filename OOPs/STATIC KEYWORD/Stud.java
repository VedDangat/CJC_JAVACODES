public class Stud{

static String collegename="MIT WPU";

public static void main(String[]args){

Stud s=new Stud();
System.out.println(Stud.collegename);

Stud s1=new Stud();
System.out.println(Stud.collegename);



Stud.collegename="JAIHIND";
System.out.println(Stud.collegename);
System.out.println(s.collegename);
System.out.println(s1.collegename);



}
}