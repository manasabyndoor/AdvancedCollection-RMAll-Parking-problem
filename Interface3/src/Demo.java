
public class Demo {
	public static void main(String args[]) 
	{
		Vehicle vehicle[] = new Vehicle[3];
		vehicle[0] = new TwoWheeler();//creating instances of subclass TwoWheeler
		vehicle[1] = new ThreeWheeler();//creating instances of subclass ThreeWheeler
		vehicle[2] = new FourWheeler();//creating instances of subclass FourWheeler
		
		vehicle[0].start();
		vehicle[1].start();
		vehicle[2].start();

	}
}
