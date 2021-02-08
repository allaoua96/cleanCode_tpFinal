import java.awt.List;
import java.util.ArrayList;

public class Library {
	public Afficher_les_les_livre_de_bibliotheque afficher;
	
	public ArrayList<Book> bibliotheque ;
	public ArrayList<User> membres ;
	
	public Library() {
		bibliotheque= new ArrayList<Book>();
		membres= new ArrayList<User>();
		this.afficher= new Afficher_les_les_livre_de_bibliotheque();
	}
	public String VoirContenuBibiliotheque() {
		return afficher.afficherLesLivre(this);
	}
}
