
public class ThreadB extends Thread {
	public void run() {
		System.out.println("Thread 'B' execute");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 'B' = " + i);
		}

	}
}
