public class Booksinfo
{

	public void Practice(){
		System.out.println("code practice");
	}

	public Booksinfo(){
		System.out.println("---all the books details are here---");
	}

	public 	Booksinfo(int bookid, String bookName, String authorName){
		System.out.println("book id is=" +bookid);
		System.out.println("book name is=" +bookName);
		System.out.println("book author name is=" +authorName);
	}
	
	public static void main(String[]args){
		
		Booksinfo bi=new Booksinfo();
		bi.Practice();

		Booksinfo bi1=new Booksinfo();
		
		Booksinfo bi2=new Booksinfo(101,"harry potter","jk rolling");
		Booksinfo bi3=new Booksinfo(102,"game of thornes","josh r martin");
		Booksinfo bi4=new Booksinfo(103,"hobbits","jrr tolkein");	

	}
}