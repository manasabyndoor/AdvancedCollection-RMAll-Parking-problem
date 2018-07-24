
public class FunOverLoadTestClass {
	public static void main(String args[]) {
		Child child = new Child(10);
		Parent parent = new Child(10);
		double j = 12;
		int i = 8;
		
		child.display(j);//calls the display function with double as argument
		child.display(i);//calls the display function in child class with integer as parameter 
		parent.display(i);
		//parent.display(j);//parent class does not have the function display with double type argument
	}

}
