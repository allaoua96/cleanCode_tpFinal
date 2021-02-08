import java.util.ArrayList;

public class Obligation_rendre_livre {
	public ArrayList<Empreint> liste_empreint;
	
	
	public Obligation_rendre_livre(ArrayList<Empreint> liste_empreint) {
		
		this.liste_empreint=liste_empreint;
	}
	
	public String rendre_livre() {
		String affichage="";
		for (Empreint empreint : liste_empreint) {
			if(empreint.Nombre_semaine_empreint==4)
				affichage="vous devez rendre    "+ empreint.book.name+" "+empreint.book.author;
		}
				
			

		return affichage;
	}
}
