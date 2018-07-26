
public class ShapeDemo {
	public static void main(String args[])
	{	
		Shape shape;
		shape= new Circle();//creating object for circle
		shape.draw();
		shape=new Rectangle();//creating object for rectangle
		shape.draw();
		shape=new Shape();
		shape.draw();
	}

}
