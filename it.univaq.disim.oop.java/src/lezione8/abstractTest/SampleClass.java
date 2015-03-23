package lezione8.abstractTest;

import lezione8.AbstractClass;


// SampleClass deve implementare il metodo f() in quanto
// abstrac, pero non puo farlo perche f() ha visibilita' 
// a livello di package. Quindi o cambio la visibilita' 
// di f() (in public o protected) oppure sposto SampleClass 
// nello stesso package di AbstractClass

//public class SampleClass extends AbstractClass {
//	void f(){
//	}
//}
