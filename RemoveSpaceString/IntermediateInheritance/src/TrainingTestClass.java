
public class TrainingTestClass {
	public static void main(String args[])
	{
		int cost;
		Training ptraining=new PublicTraining(5,"manasa", 5, 15);
		Training ctraining=new CorporateTraining(35,"byndoor", 4, 50);
		ptraining.getOrderValue();
	
		
		
		System.out.println("cost="+ptraining.getCost());
		ctraining.getOrderValue();
		System.out.println("cost="+ctraining.getCost());
	}

}
