import java.util.Scanner;
public class marks3{
	public static void main(String args[])
	{
	int a[]=new int[3],i=0,j;
	Scanner scan=new Scanner(System.in);
		int b[]=new int[3];
	int c[]=new int[3];
	//read 3 marks of 3 students
	System.out.println("Enter the marks of 1st student");
	for(i=1;i<=3;i++)
		a[i]=scan.nextInt();
	System.out.println("Enter the marks of 2nd student");
	for(i=1;i<=3;i++)
		b[i]=scan.nextInt();
	System.out.println("Enter the marks of 3rd student");
	for(i=1;i<=3;i++)
		c[i]=scan.nextInt();
	int sum,avg;
	sum(a[]);
	sum(b[]);
	sum(c);
	
for(i=1;i<=3;i++)
		sum=sum+a[i];
	avg=sum/3;
	System.out.println("sum="+sum+"avg="+avg);
	int sum2=0,avg2=0;
	for(i=1;i<=3;i++)
		sum=sum+a[i];
	avg=sum/3;
	System.out.println("sum="+sum+"avg="+avg);
	int sum3=0,avg3=0;
	
	for(i=1;i<=3;i++)
		sum=sum+a[i];
	avg=sum/3;
	System.out.println("sum="+sum+"avg="+avg);
	System.out.println("sum n avg in each sub");
	
	for(i=1;i<=3;i++)
	{
		int fsum=a[i]+b[i]+c[i];
		System.out.println("sum in"+i+ "sub"+fsum);
		
	}
	/*public static void sum(int a[]){
		for(i=1;i<=3;i++)
			sum=0;avg=0;
		sum=sum+a[i];
		avg=sum/3;
		System.out.println("sum="+sum+"avg="+avg);
		
	}*/
		
	}
}