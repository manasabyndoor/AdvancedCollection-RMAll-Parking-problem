
public class Employee {

	public int id;
	public String name;
	public double monthlyBasic;
	double monthlyGrossSalary;
	double pfRate=0.10;
	double monthlyDeduction;
	double monthlyTakeHome;
	static final double hr=0.5;
	//public int id;
	static double hra=0.5;
	static double medical=1250;
	//to set monthlybasic
	public void setMonthlyBasic(double a) {
		 monthlyBasic=a;
	}
	
	public double  getAnnualBasic()
	{	
		double annualBasics=monthlyBasic*12;
		
		return annualBasics;
	}
	public double getMonthlyGrossSalary()
	{
		double conveyance=800,medical=1250;
		double hra=monthlyBasic*hr;
	monthlyGrossSalary=monthlyBasic+hra+medical+conveyance;
	return monthlyGrossSalary;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	//to calculate annualgross salary
	double getAnnualGrossSalary()
	{
		return monthlyGrossSalary*12;
	}
	
	double getMonthlyDeductions()
	{
		double profTax = 0,pf;
		double esic=4.75;
		double answer = 0;
		if(monthlyBasic>6500)
		{
			pf=monthlyBasic*0.1;
		}
		else
		{
			pf=6500;
		}
		if(monthlyBasic<=5000)
		{
			esic=monthlyBasic*0.475;
		}
		else
		{
			esic=0;
		}
		if(monthlyBasic<=10000)
		{
			profTax=50;
		}
		
		;
		return  pf+esic+profTax;
		}
	double getMonthlyTakeHome() {
		monthlyTakeHome=monthlyGrossSalary-monthlyDeduction;
		return monthlyTakeHome;
				
				
		// TODO Auto-generated method stub
		//return;
	}
	double getAnnualTakeHome() {
		// TODO Auto-generated method stub
		return 12*monthlyTakeHome;
	}
	
	

	
}
