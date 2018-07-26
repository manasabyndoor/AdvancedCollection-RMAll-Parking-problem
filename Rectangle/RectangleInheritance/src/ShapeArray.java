
public class ShapeArray {
	public static void main(String args[]) {
		//creating instances using shape reference
		Shape shape[] = new Shape[3];
		shape[0] = new Circle();
		shape[1] = new Rectangle();
		shape[0].draw();//calling draw function using shape[0
		shape[1].draw();//calling draw function using shape[0
	}

}
