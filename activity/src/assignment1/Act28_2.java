package assignment1;

class thread1 extends Thread

{
	@Override

	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(100000);
				System.out.println("Thread Name: " + i + " " + Thread.currentThread().getName());
				System.out.println("Thread ID: " + i + " " + Thread.currentThread().getId());
				System.out.println("Thread Alive: " + i + " " + Thread.currentThread().isAlive());
				System.out.println("Thread Status: " + i + " " + Thread.currentThread().getState());
				System.out.println("Thread Priority: " + i + " " + Thread.currentThread().getPriority());
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(" thread enters DEAD state");
		System.out.println("Thread Completed!");
	}
}

public class Act28_2 {

	public static void main(String[] args) throws Exception {
		thread1 obj = new thread1();
		thread1 obj1 = new thread1();
		thread1 obj2 = new thread1();
		thread1 obj3 = new thread1();
		obj.start();// start() calling run()!!!!!!!!!!!!!!!!!!
		obj1.start();
		obj2.start();
		obj3.start();
		obj.join();
		obj1.join();
		obj2.join();
		obj3.join();
		System.out.println("Main Thread completed!");

	}

}