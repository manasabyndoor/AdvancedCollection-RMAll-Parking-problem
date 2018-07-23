import java.util.Scanner;
public class tax{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ctc");
		double ctc=scan.nextDouble();
		double incometax=0;
		//to check conditions
		if(ctc>0&&ctc<=180000)
		{
			incometax=0;
		}
		else if(ctc>180000&&ctc<=300000)
		{
			incometax=0.10*ctc;
		}
		else if(ctc>300000&&ctc<=500000)
		{
			incometax=.20*ctc;
		}
		else if(ctc>500000&&ctc<=1000000)
		{
			incometax=0.30*ctc;
		}
				System.out.println("it="+incometax);
		
	}
}