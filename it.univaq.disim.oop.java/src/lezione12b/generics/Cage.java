package lezione12b.generics;

import java.util.HashSet;
import java.util.Set;


    public class Cage<T extends Animal> {  //A cage for some types of animals
        private Set<T> cage = new HashSet<T>();

        public void add(T animal)  {
            cage.add(animal);
        }

        public void showAnimals()  {
            for (T animal : cage) {
                System.out.println(animal.toString());
            }
        }
    }

    class Animal {
        public String toString() {
            return getClass().getSimpleName();
        }
    }
    class Rat extends Animal {

		public Rat(boolean b, int i, String string, boolean c) {
			// TODO Auto-generated constructor stub
		}
	}
    
    class Lion extends Animal {

		public Lion(boolean b, int i, String string, int j) {
			// TODO Auto-generated constructor stub
		}
	}
    //class Cage<T extends Animal> { /* above */ }

    