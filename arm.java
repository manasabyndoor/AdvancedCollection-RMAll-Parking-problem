public class arm{
public static void main(String[] args){
	int number;
	int i;
	//checking for armstrong number in the range 100-999
	for(i=100;i<=999;i++)
	{
		number=i;
		int total=0,temp=0;
		//int num=number;
	while(number!=0)
	{
		temp=number%10;
		total=total+temp*temp*temp;
		number=number/10;
		
	}
if(total==i){
	System.out.println(i + "is armstrong");
}
	}
} }