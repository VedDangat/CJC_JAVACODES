public class MovieTicket{
	String name;
	String gener;
	float price;
	int setno;
	char row;


public void displayTicket(){
	System.out.println("name of movie=" +name);
	System.out.println("gener of movie=" +gener);
	System.out.println("price of ticket=" +price);
	System.out.println("set number=" +setno);
	System.out.println("row where we have to sit is" +row);
}

public static void main(String []args)
{
	MovieTicket m=new MovieTicket();

	m.name="spiderman brand new day";
	m.gener="action advanture";
	m.price=1000.12f;
	m.setno=50;
	m.row='H';

	System.out.println("--our ticket details-- ");
	
	m.displayTicket();
}
}

