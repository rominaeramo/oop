/**
 * 
 */
package esempi;

class Zampa{}

abstract class Animale { 

	public abstract void mangia() ; 

	public abstract void dorme() ; 

} 

class Cane extends Animale { 

	Zampa sinistraAnteriore; 

	Zampa destraAnteriore; 

	Zampa sinistraPosteriore; 

	Zampa destraPosteriore; 

	Cane() 

	{ 

		sinistraAnteriore=new Zampa(); 

		destraAnteriore=new Zampa(); 

		sinistraPosteriore=new Zampa(); 

		destraPosteriore=new Zampa(); 

	} 

	public void mangia() {} 

	public void dorme() {} 

} 

class Gatto extends Cane { 

	public void disobbediente () {} 

	public void siArrampicaSugliAlberi() {} 

} 
/*
Quali delle seguenti affermazioni non è vera ? 

1. Un Gatto eredita 4 istanze di Zampa dalla superclasse Cane 

2. Un Gatto può mangiare e dormire

3. Un Gatto si arrampica sugli alberi

4. La relazione tra Cane e Animale è un esempio di uso approrpiato dell’ereditarietà 

5. La relazione tra Gatto e Cane è un esempio di uso inappropriato dell’ereditarietà 

6. Nessuna delle precedenti.
 */