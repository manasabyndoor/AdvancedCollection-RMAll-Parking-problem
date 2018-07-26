
public class RectangleTestClass {
	public static void main(String args[]) {

		Rectangle rect2 = new Rectangle();
		Rectangle rect1 = new Rectangle();
		rect1.breadth = 2;
		rect1.length = 10;
		rect2.breadth = 2;
		rect2.length = 1;
		int area1 = 0;
		int area2 = 0;
		//calling area method using objects
		area1 = rect1.area(rect1.breadth, rect1.length);
		area2 = rect2.area(rect2.breadth, rect2.length);
		// area2=rect2.breadth*rect2.length;

		if (area1 == area2) {
			System.out.println("area are equal" + area1);
			// return;
		} else
			System.out.println("area are not equal");
	}
}
