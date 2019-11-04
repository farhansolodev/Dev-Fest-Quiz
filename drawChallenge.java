import java.util.Date; // to allow our tasks to run at the current time
import java.util.Timer; // contains the method which will allow a task to run at specific intervals
import java.util.TimerTask; //contains an abstract inherited run() method

public class drawChallenge {
	static Timer timer = new Timer();
	static int i = 0;
	public static void main(String args[]) {
		timer.scheduleAtFixedRate(new Output(),new Date(),1000); //this method from the class Timer allows our task to run every 1000ms
	}
}

class Output extends TimerTask {
	
	public void run() { //inherited run method from the class Object now defined
		drawChallenge.i++;
		if (drawChallenge.i % 3 != 0 && drawChallenge.i % 5 != 0) {
			System.out.println("google");
		}
		if(drawChallenge.i % 15 != 0) {
			if(drawChallenge.i % 5 == 0) {
				System.out.println("fest");
			} else if(drawChallenge.i % 3 == 0) {
				System.out.println("dev");
			}
		} else {
			System.out.println("devfest");
		}
		if(drawChallenge.i == 500) { //stops task from running after the 500th time
			drawChallenge.timer.cancel();
		}
	}
	
}
