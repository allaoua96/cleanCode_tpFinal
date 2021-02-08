
public class Test {

	public static void main(String[] args) {
	
		Library bibliotheque = new Library();
		Librarian librarian = new Librarian(0, bibliotheque);
		System.out.println(librarian.login );
		Book livre = new Book("allaoua", "allaoua");
		Book livre2 = new Book("esgi", "esgi");
		Book livre3 = new Book("allaoua", "esgi");
		
		librarian.addBook(bibliotheque, livre);
		librarian.addBook(bibliotheque, livre2);
		librarian.addBook(bibliotheque, livre3);
		
		System.out.println(bibliotheque.VoirContenuBibiliotheque());
		
		Membre membre = new Membre(1, bibliotheque);
		Empreint empreint = new Empreint(2,livre,4);
		membre.emprunter_livre(empreint);
		System.out.println(membre.doit_il_rendre_un_livre());
		
		Guest guest = new Guest(5, bibliotheque);
		System.out.println(guest.library.VoirContenuBibiliotheque());
		
	}

}



