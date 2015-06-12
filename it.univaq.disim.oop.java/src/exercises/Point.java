package exercises;

class Point {
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	static Point[] makeArray(int n) {
		Point[] res = new Point[n];
		Point pt = new Point(0,0);
		for (int i = 0; i < res.length; i++){			
			pt.x = i;
			res[i] = pt;
			System.out.println("pt.x: " + pt.x);
			System.out.println("pt.y: " + pt.y);
		}		
		return res;
	}
	
	static int sum(Point[] a){
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("sum: " + a[i].x);
			res += a[i].x;
		}
		return res;
	}
	
	public static void main(String[] args) {

		System.out.println(Point.sum(Point.makeArray(2)));
		
	}	
}
