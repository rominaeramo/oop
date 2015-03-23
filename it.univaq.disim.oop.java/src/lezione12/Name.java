package lezione12;

public class Name implements Comparable {
    private String  firstName, lastName;

    public Name(String firstName, String lastName) {
    	if (firstName==null || lastName==null)
    		throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {return firstName;}
    public String getLastName()  {return lastName;}

    public boolean equals(Object o) {
        if (this == o ) return true;
        if (!(o instanceof Name))
        	return false;
        Name n = (Name)o;
        return n.firstName.equals(firstName) &&
               n.lastName.equals(lastName);
    }

    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }

	public String toString() {
	    return firstName + " " + lastName;
	}
	
 
	public int compareTo(Object o) {
	    Name n = (Name)o;
	    int lastCmp = lastName.compareTo(n.lastName);
	    return (lastCmp!=0 ? lastCmp : firstName.compareTo(n.firstName));	//  0: gli elementi sono uguali
																			// -1: quello preso in ingresso va prima
																			//  1: quello preso in ingresso va dopo
	}


}
