package thread.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ExampleForReentrantLock {

	ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		ExampleForReentrantLock e = new ExampleForReentrantLock();
		Thread first = new Thread(e.createTask(), "FirstThread");
		Thread second = new Thread(e.createTask(), "SecondThread");
		first.start();
		second.start();
		try {
			Thread.sleep(600);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		second.interrupt();

	}

	private Runnable createTask() {
		return new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						if (lock.tryLock()) {
							try {
								System.out.println("locked "
										+ Thread.currentThread().getName());
								Thread.sleep(1000);
							} finally {
								lock.unlock();
								System.out.println("unlocked "
										+ Thread.currentThread().getName());
							}
							break;
						} else {
							System.out.println("unlocked to lock "
									+ Thread.currentThread().getName());
						}
					} catch (InterruptedException e) {
						System.out.println(Thread.currentThread().getName()
								+ " is Interrupted");
					}
				}

			}

		};
	}
}
