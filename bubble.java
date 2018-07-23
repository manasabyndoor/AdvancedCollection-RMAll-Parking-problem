import java.util.Scanner;
public class bubble{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5],i=0,j;
		System.out.println("Array");
		int n=arr.length;
		//read n elements
		for(i=0;i<n;i++)
		arr[i]=scan.nextInt();
		//sorting
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
				System.out.println("Sorted array:");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	

	
	
	
	
	
	
	}
}
	