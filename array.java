import java.util.Scanner;
public class array{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[15],i=0;
		System.out.println("Array");
		//read the elements
		for(i=0;i<15;i++)
		arr[i]=scan.nextInt();	
	int key;
	
	System.out.println("Enter the key");
	key=scan.nextInt();
	
	for(i=0;i<15;i++)
	{	//to check if the key matches
		if(key==arr[i])
		{
			System.out.println("key found");
return;			
	}
	else{
		System.out.println("keynot  found");
return;			
	}}
	}
}