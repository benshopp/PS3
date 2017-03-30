package pkgLibrary;

public class BookException extends Exception {
	
	
	/**
	 * I've watched many tutorials on exceptions, 
	and understand this is how it should be 
	laid out, but don't know how to apply 
	it to this project
	 * 
	 */
	public BookException(String Bookid){
		super(Bookid);
		
	}
	
	public BookException(Catalog C, String Bookid){
		
	}

	public BookException(Catalog C, Book b){
		
	}
}
