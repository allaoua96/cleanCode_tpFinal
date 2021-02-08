
public class Librarian extends User implements AddBook{

	
	public Librarian(int login, Library l) {
		super(login, l);
		
	}



	@Override
	public void addBook(Library lib, Book book) {
		lib.bibliotheque.add(book);
		
	}

	

}
