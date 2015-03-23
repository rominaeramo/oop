/**
 * 
 */
package esempi;

/**
 * @author romina
 * @see http://www.di.univaq.it/romina.eramo/tlp
 *
 */
public class Point {
	
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static Point[] makeArray(int n, Point pt){
		Point[] result = new Point[n];
		for( int i = 0; i < n; i++ ){
			pt.x += n;
			pt.y += n;
			result[i] = pt;
		}
		return result;
	}
	
	public static Point sum(Point[] points){
		Point result = points[0];
		for(int i = 1; i < points.length; i++){
			result.x += points[i].x;
			result.x += points[i].y;
		}
		return result;
	}
	
	public static void main(String[] args){
		Point pt1 = new Point(3,3);
		Point pt2 = Point.sum(Point.makeArray(2, pt1));
		
		System.out.println("pt1.x: "+ pt1.x + ", pt1.y: " + pt1.y);
		System.out.println("pt2.x: "+ pt2.x + ", pt2.y: " + pt2.y);
	}
}
