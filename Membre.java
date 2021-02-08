import java.util.ArrayList;

public class Membre  extends User implements Borrow {
	public ArrayList<Empreint> livres_empreintes;
	public Obligation_rendre_livre rendreLivre ;

	public Membre(int n, Library l) {
		super(n, l);
		this.livres_empreintes= new ArrayList<Empreint>();
		this.rendreLivre = new Obligation_rendre_livre(livres_empreintes);
		
	}

	@Override
	public void emprunter_livre(Empreint e) {
		if(this.livres_empreintes.size()<=3) this.livres_empreintes.add(e);
		
	}
	public String doit_il_rendre_un_livre() {
		return this.rendreLivre.rendre_livre();
	}

	

}
