class Ac extends Thread{
	int total=1;

	public void run() {
		synchronized (this) {
		
			System.out.println("Sum of thread");
		for(int i=0; i<=10;i++) {
			total=total+i;
		}
		System.out.println("Data is on Final Stage");
		for(int i=1; i<=5;i++ ) {
			++total;
		}
		System.out.println("Sub thread going to notify");
		this.notify();
		}
}
}
public class Interthreadcommunication {
public static void main(String[] args) throws InterruptedException {
	Ac t1= new Ac();
	t1.start();
	synchronized (t1) {
		System.out.println("Main is Going on sleep state");
	t1.wait();
	System.out.println("Main got notification");
	}
	Thread.sleep(1,0);
	System.out.println("Main show result");
	System.out.println(t1.total);
}
}
