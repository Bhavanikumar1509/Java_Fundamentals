package OOPS;
class Book {
	private String BookName;
	private String ISBNnumber;
	private String AuthorName;
	private String Publisher;
	public Book(String bookName, String iSBNnumber, String authorName, String publisher) {
		BookName = bookName;
		ISBNnumber = iSBNnumber;
		AuthorName = authorName;
		Publisher = publisher;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getISBNnumber() {
		return ISBNnumber;
	}
	public void setISBNnumber(String iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	void getBookInfo() {
		System.out.printf("Book Name:%s\nISBN NUmber:%s\nAuthor Name:%s\nPublisher:%s",BookName,ISBNnumber,AuthorName,Publisher);
	}
	
	

	

}
public class Q5{
public static void main(String[] args) {

Book test[] = new Book[30];
test[1]=new Book("HarryPotter","11H394y8","JKROwlings"," WaltDisney");
test[2]=new Book("avengers", "iug3287sj", "Jhonny Depp", "robert downey Jr");
test[1].getBookInfo();


}
}
 