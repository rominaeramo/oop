/**
Nel contesto di un software per biblioteche, si implementi una classe Publication, che rappresenta una pubblicazione. Ciascuna pubblicazione ha un titolo e una data di uscita.
Implementare le sottoclassi Book e Magazine. Un libro (book) ha anche un codice ISBN (numero intero di 13 cifre), mentre una rivista (magazine) ha un numero progressivo. Inoltre, una pubblicazione può fare riferimento ad altre pubblicazioni tramite riferimenti bibliografici.


Implementare tutti i metodi necessari a rispettare il seguente caso d'uso:

public static void main(String[] x) {

Publication libro = new Book("The Art of Unix Programming", new
Date(1990, 3, 24), 123456);

Publication rivista = new Magazine("Theoretical Computer Science",
new Date(1985, 4, 13), 74);

rivista.addReference(libro);

for (Publication p : rivista . references ())
System.out.println(p);

libro.addReference(libro);
}


Output del codice precedente:

The Art of Unix Programming, ISBN: 123456

Exception in thread "main" java.lang.RuntimeException
at Publication.addReference(PublicationTest.java:13)
at PublicationTest.main(PublicationTest.java:59)
 */


package esempi;

import java.util.List;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class Publication {
	
	String title;
	String date;
	List<Publication> references; 
	
	/**
	 * @param title2
	 * @param date2
	 */
	public Publication(String title, String date) {
		this.title = title;
		this.date = date;
	}

	public static void main(String[] args){
		
		Publication libro = new Book("titolo", "data", 1);
		Publication rivista = new Magazine("titolo2", "data2", 2);
		
		rivista.addReference(libro);
		for( Publication p : rivista.references()){
			System.out.println(p);
		}
		
		libro.addReference(libro); // implementa
	
	}

	/**
	 * @return
	 */
	private List<Publication> references() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param libro
	 */
	private void addReference(Publication libro) {
		// TODO Auto-generated method stub
		
	}
	
}

class Book extends Publication{
	
	int isbn;
	
	public Book(String title, String date, int isbn) {
		super(title, date);
		this.isbn = isbn;
	}
}
class Magazine extends Publication{
	
	int number;
	
	Magazine(String title, String date, int number){
		super(title, date);
		this.number = number;
	}
	
}




// output : 
// titolo, isbn : 1
// Exception in thread "main" java.lang.RuntimeException
//	at Publication.addReference(PublicationTest.java:13)
//	at PublicationTest.main(PublicationTest.java:59)