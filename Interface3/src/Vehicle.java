
public interface Vehicle {
	//defining start function so that it can be over ridden
	public default void start() 
	{
		System.out.println("Vehicle");
	}

}
