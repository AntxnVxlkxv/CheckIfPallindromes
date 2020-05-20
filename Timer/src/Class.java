import java.util.Timer;
import java.util.TimerTask;

public class Class {
	int secondsPassed;
	int secondEnd;

	public int getSecondEnd() {
		return secondEnd;
	}

	public void setSecondEnd(int secondEnd) {
		this.secondEnd = secondEnd;
	}

	public int getSecondsPassed() {
		return secondsPassed;
	}

	public void setSecondsPassed(int secondsPassed) {
		this.secondsPassed = secondsPassed;
	}

	public Class(int secondsPassed, int secondEnd) {
		super();
		this.secondsPassed = secondsPassed;
		this.secondEnd = secondEnd;
	}

	Timer timer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
			System.out.println("Seconds passed: " + secondsPassed);
			if (secondsPassed == secondEnd) {
				System.out.println("Timer has stopped");
				System.exit(0);
			}
		}
	};
	Timer timer1 = new Timer();
	TimerTask task1 = new TimerTask() {
		public void run() {
			secondsPassed++;
			System.out.println("Seconds passed: " + secondsPassed);
		}
	};

	public void start1() {
		timer.scheduleAtFixedRate(task1, 1000, 1000);
	}

	public void start() {
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
}