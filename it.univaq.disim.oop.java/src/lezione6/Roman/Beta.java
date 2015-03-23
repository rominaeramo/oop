package lezione6.Roman;

import lezione6.Greek.*;

class Beta {
    void accessMethod() {
        Alpha a = new Alpha();
        //a.iampublic = 10;      //Illegal 
        a.publicMethod();        // legal
    }
}

