
public class Complex {

	float real;
	float imaginary;
	float sum;

	public void set(float x, float y)// set the values
	{
		real = x;
		imaginary = y;

	}

	void display() {
		System.out.print(real);
		System.out.println("+" + imaginary + "i");
	}

	public float add(float a, float b) {

		return a + b;
	}

}
