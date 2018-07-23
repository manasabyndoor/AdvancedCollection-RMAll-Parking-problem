import java.util.Scanner;
public class simple{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int p=scan.nextInt();
		int t=scan.nextInt();
		double r=scan.nextDouble();
		//to calculate simple interest
		double s=(p*t*r)/100;
		//to calculate compound interest
		double c=p*Math.pow(1.0+r/100,t)-p;
		System.out.println("si="+s);
		System.out.println("ci="+c);
	}
}