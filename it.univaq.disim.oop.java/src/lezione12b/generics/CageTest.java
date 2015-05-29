/**
 * 
 */
package lezione12b.generics;

import java.util.ArrayList;
import java.util.Collection;
import lezione12b.generics.Cage;

/**
 * @author romina
 *
 */

public class CageTest {

    public static void main(String[] args) {
        Lion lion1 = new Lion(true, 4, "Lion King", 8);
        Lion lion2 = new Lion(true, 4, "King of Animals", 9);
        Rat rat1 = new Rat(true, 4, "RatBoy", true);
        Rat rat2 = new Rat(true, 4, "RatGirl", true);
        Rat rat3 = new Rat(true, 4, "RatChild", true);

        Cage<Animal> animalCage = new Cage<Animal>();
        animalCage.add(rat2);
        animalCage.add(lion2);

        Cage<Rat> ratCage = new Cage<Rat>();
        ratCage.add(rat3);
        ratCage.add(rat1);
        ratCage.add(rat2);
//      ratCage.add(lion1); //Not Possible. A Lion is no rat

        Cage<Lion> lionCage = new Cage<Lion>();
        lionCage.add(lion2);
        lionCage.add(lion1);

        Cage<? extends Animal> someCage = new Cage<Animal>(); //? = "unknown type that is a subtype of Animal, possibly Animal itself"
        someCage = ratCage; //OK
        someCage = animalCage; //OK
        //someCage.add(rat1);  //Not Possible, but why?

        animalCage.showAnimals();
        System.out.println("\nRatCage........");
        ratCage.showAnimals();
        System.out.println("\nLionCage........");
        lionCage.showAnimals();
        System.out.println("\nSomeCage........");
        someCage.showAnimals();
        
        
        Cage<? extends Animal> cageA = new Cage<Lion>(); //perfectly correct, but:
        //cageA.add(new Rat());  // is not, the cage is not guaranteed to be an Animal or Rat cage. 
                               // It might as well be a lion cage (as it is).
                               // This is the same example as in Kaj's answer, but the reason is not
                               // that a concrete Cage<Lion> is assigned. This is something, the
                               // compiler might not know at compile time. It is just that 
                               // <? extends Animal> cannot guarantee that it is a Cage<Rat> and 
                               // NOT a Cage<Lion>
        //You cannot:
        //Cage<Animal> cageB = new Cage<Rat>(); //because a "rat cage" is not an "animal cage".
                                              //This is where java generics depart from reality.
        //But you can:
        Cage<Animal> cageC = new Cage<Animal>();
        //cageC.add(new Rat());  // Because a Rat is an animal.
        
        
        
        
    }
}
