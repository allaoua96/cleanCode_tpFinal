
public class Book {
	public String name;
	public String author;
	
	public Book(String name,String author) {
		this.name=name;
		this.author=author;
	}
	
	public String affiche_livre() {
		return "" +this.name +"  "+ this.author ;
	}

}
