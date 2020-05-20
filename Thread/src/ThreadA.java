
public class ThreadA extends Thread {
	public void run() {
		System.out.println("Thread 'A' execute");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 'A' = " + i);
		}

	}
}
