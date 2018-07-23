public class First{
public static void main(String[] args){
	int num=370,number,temp,total=0;
	number=num;
	//to find cube of each digit in the number
	while(number!=0)
	{
		temp=number%10;
		total=total+temp*temp*temp;
		number=number/10;
		
	}
if(total==num)
	System.out.println(num + "is armstrong");
else
	System.out.println(num + "is not armstrong");
} }