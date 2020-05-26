class Demoz1 extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Sub Thread");
		}
		Thread.yield();
	}
}
public class threadyieldsleep {
public static void main(String[] args) throws InterruptedException  {
	Demoz1 d = new Demoz1();
	d.start();
	d.yield();
	for(int i=1; i<=10; i++) {
		System.out.println("Main Thread");
		Thread.sleep(5000);
	}
}
}
