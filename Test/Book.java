package ArrayExample;

public class Book {

	String bkName;
	String bkAuthor;
	double price;
	double noOfPages;
	
	public Book(String bkName,String bkAuthor,double price,double noOfPages) {
		this.bkName=bkName;
		this.bkAuthor=bkAuthor;
		this.price=price;
		this.noOfPages=noOfPages;
	}

	
	
@Override
public String toString() {
	return "Book [bkName=" + bkName + ", bkAuthor=" + bkAuthor + ", price=" + price + ", noOfPages=" + noOfPages
			+ "]";
}
}