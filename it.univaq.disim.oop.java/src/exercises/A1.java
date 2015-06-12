package exercises;


class A1 {
	
	A1() { }

	B1 push(int i) {
		return new B1(i, this);
	}

	void incr(int i) { }

}

class B1 extends A1 {

	int val;
    A1 tl;

    B1(int val, A1 tl) {
    	this.val = val;
    	this.tl = tl;
    }

    void incr(int i) {
    	val += 1;
    	if (i != 0) { 
    		tl.incr(i -1);
    	}	
    }

    void swap(B1 b) {
    	this.tl = b.tl;
    }

}

