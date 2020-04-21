import java.util.Date; // to allow our tasks to run at the current time
import java.util.Timer; // contains the method which will allow a task to run at specific intervals
import java.util.TimerTask; //contains an abstract run() method

public class drawChallenge {
	static Timer timer = new Timer();

	public static void main(String args[]) {
		timer.scheduleAtFixedRate(new Output(),new Date(),1000); //this method from the class Timer allows our task to run every 1000ms
	}
}

class Output extends TimerTask {
	int i = 0;
	
	public void run() { //inherited method from TimerTask
		i++;
		if(i % 15 != 0) {
			if(i % 5 == 0) {
				System.out.println("fest");
			} else if(i % 3 == 0) {
				System.out.println("dev");
			} else {
				System.out.println(i);
			}
		} else {
			System.out.println("devfest");
		}

		if(i == 500) { //stops task from running after the 500th time
			drawChallenge.timer.cancel();
		}
	}
	
}
