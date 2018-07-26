public class Derived extends Base{
	int y;
	Derived(int y)
	{
		super();//invokes base class,x value will be retrieved
		this.y=y;
		System.out.println("DErived x="+x+"y="+y);
	}
	
	
	
}
