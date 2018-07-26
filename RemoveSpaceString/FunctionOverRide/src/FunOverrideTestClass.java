
public class FunOverrideTestClass {
	public static void main(String args[])
	{
	Parent parent=new Parent();
	Parent p=new Child();
	p.disp();//disp() method of child class is called 
	parent.disp();//disp() method of parent class is called
	}
	

}
