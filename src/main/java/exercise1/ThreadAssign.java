package exercise1;

public class ThreadAssign extends Thread {
	
	ThreadAssign(String name){
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is in running state.");
	}

}
