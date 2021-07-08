package exercise5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number two = new Number(2);
		Number five = new Number(5);
		Number eight = new Number(8);
		
		Thread t1 = new Thread(two,"t1");
		Thread t2 = new Thread(five,"t2");
		Thread t3 = new Thread(eight, "t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
