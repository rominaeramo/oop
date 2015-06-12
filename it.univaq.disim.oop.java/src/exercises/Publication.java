package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public abstract class Publication {
	protected String titolo;
	protected Date d_uscita;
	protected Collection<Publication> reference;
	
	public Publication() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void addReference(Publication p) throws Exception;
	
	public Collection<Publication> references(){
		return reference;
	}
	
	public static void main(String[] args) {

		
		try {
		Publication libro = new Book("The Art of Unix Programming", new Date(1990, 3, 24), 123456);

		Publication rivista = new Magazine("Theoretical Computer Science", new Date(1985, 4, 13), 74);
		
		rivista.addReference(libro);

		for (Publication p : rivista.references())
		System.out.println("rivista: "+p);

		libro.addReference(libro);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Book extends Publication {
	long ISBN;
	
	public Book(String t, Date d, long i) {
		titolo = t;
		d_uscita = d;
		this.ISBN = i;
		reference = new ArrayList<Publication>();
	}
	
	public void addReference(Publication p) throws Exception {
		reference.add(p);
		if(this.equals(p)) throw new Exception();
	}
	
}

class Magazine extends Publication {
	int serie;
	
	public Magazine(String t, Date d, int s) {
		titolo = t;
		d_uscita = d;
		serie = s;
		reference = new ArrayList<Publication>();
	}
	
	public void addReference(Publication p) throws Exception {
		reference.add(p);
		if(this.equals(p)) throw new Exception();
	}
	

}
