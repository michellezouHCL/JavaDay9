package exercise5;

public class Number implements Runnable {
	int num;

	public Number(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println("Multiple of " + this.num + ":");
		if (this.num == 2) {
			System.out.println("2,4,6,8,10");
		} else if (this.num == 5) {
			System.out.println("5,10,15,20,25");
		} else if (this.num == 8) {
			System.out.println("8,16,24,32,40");
		}

	}

}
