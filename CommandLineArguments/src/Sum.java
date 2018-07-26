//Command Line Arguments means to pass inputs during execution of prgm
class Sum
{
public static void main(String [] args)
{
int x,y,sum;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
sum=x+y;
System.out.println("sum of arguments"+sum);
}
}