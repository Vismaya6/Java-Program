//Author:Vismaya Theresa Benny
//Java program in overriding

package module2;
class Book{
	String title;
	String author;
	double price;

Book(String author,String title,double price){
	this.author=author;
	this.title=title;
	this.price=price;
}
public void Display(){
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("Price: "+price);
	
	}
}
class EBook extends Book{
	double fileSizeMb;
	EBook(String title,String author,double price,double fileSizeMb){
	super(author,title,price); 
	this.fileSizeMb=fileSizeMb;
	}
	public void Display() {
	super.Display();
		System.out.println("File Size: "+fileSizeMb);
		
	
	//public void Display(){
		//System.out.println("Title: "+title);
		//System.out.println("Author: "+author);
		//System.out.println("Price: "+price);
		//System.out.println("File Size: "+fileSizeMb);
		//}
}}
class printedBook extends Book {
	int numofpages;
	printedBook(String title,String author,double price,int numofpages){
		super(author,title,price); 
		this.numofpages=numofpages;
		}
	public void Display() {
		super.Display();
	System.out.println("Number of Pages: "+numofpages);
	}
}

public class Demo {
	public static void main(String[]args) {
		EBook ebook=new EBook("title","author",0,0);
		ebook.Display();
		System.out.println();
		printedBook books=new printedBook("Wings of Fire","APJ",500,1200);
		books.Display();
		System.out.println();
		
	}
}


