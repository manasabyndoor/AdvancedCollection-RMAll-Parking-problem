import java.util.Scanner;

public class ComplexTestClass {
	public static void main(String args[]) {
		//creating 3 objects
		Complex complex1 = new Complex();
		Complex complex2 = new Complex();
		Complex complex3 = new Complex();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the real part of first number");
		complex1.real = scanner.nextFloat();

		System.out.println("Enter the imag part of first number");
		complex1.imaginary = scanner.nextFloat();

		System.out.println("Enter the real part of second number");
		complex2.real = scanner.nextFloat();

		System.out.println("Enter the imag part of second number");
		complex2.imaginary = scanner.nextFloat();

		complex1.display();
		complex2.display();

		float finalreal = complex3.add(complex1.real, complex2.real);
		float finalimag = complex3.add(complex1.imaginary, complex2.imaginary);

		System.out.print("Sum=" + finalreal);
		System.out.print("+" + finalimag + "i");

	}
}
