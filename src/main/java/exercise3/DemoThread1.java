package exercise3;

public class DemoThread1 implements Runnable {
	public DemoThread1() {
		Thread t1 = new Thread();
		t1.start();
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " running child Thread in loop:" + i);
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
