package lezione4;

public class PointS {
	int x;
	int y;
	
	PointS(int x, int y) {
	this.x = x;
	this.y = y;
	}

	public static PointS[] makeArray(int n, PointS pt) {
		PointS[] res = new PointS[n];
		for (int i = 0; i < n; i++) {
			pt.x = pt.x + n;
			pt.y = pt.y + n;
			res[i] = pt;
		}
		return res;
	}

	public static PointS sum(PointS[] a) {
		PointS res = a[0];
		for(int i = 1; i < a.length; i++) {
			res.x = res.x + a[i].x;
			res.x = res.x + a[i].y;
		}
		return res;
	}
	
	public static void main(String[] args) {
		PointS pt1 = new PointS(3,3);
		PointS pt2 = PointS.sum(PointS.makeArray(2, pt1));
		
		System.out.println("pt1.x: " + pt1.x);
		System.out.println("pt1.y: " + pt1.y);
		System.out.println("pt2.x: " + pt2.x);
		System.out.println("pt2.y: " + pt2.y);

	}

}
