package lezione7;

class Point {
    int x,y;
    final Point root;
    static final Point ORIGIN;
    
    static {
           ORIGIN = new Point(0,0);
    }

    public Point(int x, int y ){
           this.x = x;
           this.y = y;
           root = null;
    }
	public Point(int x, int y, Point root ){
           this.x = x;
           this.y = y;
           this.root = root;
    }
}

