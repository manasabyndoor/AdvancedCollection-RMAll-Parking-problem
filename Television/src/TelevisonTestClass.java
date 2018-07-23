import java.util.Scanner;

public class TelevisonTestClass {

	public static void main(String args[]) {
		int volume;
		int channel;

		Scanner scanner = new Scanner(System.in);
		Television television = new Television("off", 10, 1);
		System.out.println("Enter the state");
		television.state = scanner.nextLine();
		String state = television.setState(television.state);
		System.out.println("State=" + television.getState());
		if (state.equals("on")) {
			System.out.println("Enter the volume(increase by one/decrease by one1to increase 0 to decrease ");
			volume = scanner.nextInt();
			if (volume == 1) {
				television.IncrementVolume();
			} else if (volume == 0) {
				television.DecrementVolume();

			}
			// int res=television.getVolume();

			System.out.println("Volume" + television.getVolume());
			System.out.println("Enter the channnel ");
			television.channel = scanner.nextInt();
			television.setChannel(television.channel);
			System.out.println("Channel=" + television.getChannel());

		}
	}
}
