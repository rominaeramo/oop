package exercises;

class Point2 {
	int x;
	int y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static Point2[] makeArray(int n, Point2 pt) {
		Point2[] res = new Point2[n];
		for (int i = 0; i < n; i++) {
			pt.x = pt.x + n;
			pt.y = pt.y + n;
			res[i] = pt;
		}
		return res;
	}
	public static Point2 sum(Point2[] a) {
		Point2 res = a[0];
		for(int i = 1; i < a.length; i++) {
			res.x = res.x + a[i].x;
			res.x = res.x + a[i].y;
		}
		return res;
	}	
	public static void main(String[] args) {

		Point2 pt1 = new Point2(1,2);
		Point2 pt2 = Point2.sum(Point2.makeArray(2, pt1));
		System.out.println("Point2");
		System.out.println(pt1.x);	
		System.out.println(pt1.y);	
		System.out.println(pt2.x);	
		System.out.println(pt2.y);	
	}
}
