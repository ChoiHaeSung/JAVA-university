import java.util.*;

class Point {
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {return"("+x+","+y+")";}
}
public class ArrayListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> list = new ArrayList<>();
		
		list.add(new Point(0, 0));
		list.add(new Point(4, 0));
		list.add(new Point(3, 5));
		list.add(new Point(-1, 3));
		list.add(new Point(13, 2));
		
		System.out.println(list);
		
	}

}
