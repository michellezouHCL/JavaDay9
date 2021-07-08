package exercise1;

public class Test {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentThreadName = Thread.currentThread().getName();
		ThreadAssign t1 = new ThreadAssign(currentThreadName);
		t1.setName("MyThread");
		t1.start();
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);

		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// As answer to exercise 2, it will show display Compilation Error of unhandled
		// exception type InterruptedException
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);

	}

}
