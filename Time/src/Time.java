
public class Time {

public int hours;
public int minutes;

int add(int a,int b)
{
	return a+b;
}
public void display() {
	// TODO Auto-generated method stub
	System.out.print( hours+ ":");
	System.out.println(minutes);
}
public void validate(int a, int b) {
	if(a>24) { int temp=a;
		int rem=temp%24;
		int day=temp/a;
		System.out.println(day+"day"+rem+"hours");
		return;
	}
	if(b>60)
	{
		int tempr=b;
		int remin=tempr%60;
		int hr=tempr/60;
		System.out.println(hr+"hours"+remin+"minutes");
		return;
		
	}
	
}
	
}
