public class Main {

	public static void main(String[] args) {
		System.out.println("Main thread executing...");
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.setPriority(1);
		b.setPriority(10);
		b.start();
		a.start();

	}

}
