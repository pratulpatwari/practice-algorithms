package dev.pratul;

public class Threading implements Runnable {

	int counter = 1000;

	public int getCount() {
		return counter;
	}

	@Override
	public void run() {
		try {
			counter += 1;
			System.out.println(Thread.currentThread().getName() + " is running. Value of i = " + counter);
			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	public static void main(String... args) {
		Threading runnable = new Threading();
		for (int i = 0; i < 10; i++) {
			new Thread(runnable).start();
			System.out.println(runnable.getCount());
		}
		String accounts = "1234";
		String[] acc = accounts.split(",");
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i]);
		}
	}
}
