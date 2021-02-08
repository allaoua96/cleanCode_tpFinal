import java.util.ArrayList;

public class Afficher_les_les_livre_de_bibliotheque {
	
	public String afficherLesLivre( Library l) {
		String affichage="";
		ArrayList<Book> bibliotheque = l.bibliotheque;
		for (Book book : bibliotheque) {
			affichage+=book.affiche_livre()+"\n";
		}
		return affichage;
		
	}

}
