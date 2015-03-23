/**
 * 
 */
package esempi;

import java.util.*;

public class TestCollection1 {

	public static void main (String args[]) { 

		Object a = new HashSet(), b = new HashMap(); 

		Object c = new Hashtable(); 

		System.out.print((a instanceof Map)+","); 

		System.out.print((b instanceof Map)+","); 

		System.out.print(c instanceof Map); 

	}
}