
public class Television {

	String state;
	private int volume;
	int channel;
	public Television(String state, int volume, int channel) {
		super();
		this.state = state;
		this.volume = volume;
		this.channel = channel;
		System.out.println("Initial state="+this.state);
		System.out.println("Volume="+this.volume);
		System.out.println("Volume="+this.channel);
	}
	//returns the initial state
	public String getState() {
		return this.state;
	}
	//sets the state entered by user
	public String setState(String state) {
		
		return this.state = state;
	}
	public String setChannel(int channel2) {
		// TODO Auto-genated method stub
		return this.state;
	}
	
	
	public int getChannel() {
		return this.channel;
	}
	public int getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}
	//increments volume
	public int IncrementVolume(){
		return this.volume++;
		
	}
	//decrements volume
	public int DecrementVolume(){
		return this.volume--;
		
	}
	
	
	
	
}
