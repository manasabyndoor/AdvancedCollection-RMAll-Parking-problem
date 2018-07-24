
public class CorporateTraining extends Training {
	private int cost;
	private int days;
public CorporateTraining(int id, String subject, int fees,int days) {
		super(id, subject, fees);
		this.days=days;
	}

public void getOrderValue()
{
	this.cost= getFees()*days;

	
}


public int getCost() {
	return cost;
}

}
