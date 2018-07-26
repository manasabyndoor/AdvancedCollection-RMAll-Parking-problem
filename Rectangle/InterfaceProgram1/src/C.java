
public class C implements B {
	//definition of disp1
	public void disp1() {
		System.out.println("Disp1");

	}
	//definition of disp2
	public void disp2() {
		System.out.println("Disp2");

	}
	//creating instances of C 
	public static void main(String args[]) {
		C c = new C();
		c.disp1();
		c.disp2();
	}

}
