class Demoz extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Sub Thread");
		}
		Thread.yield();
	}
}
public class Threadyeild {
public static void main(String[] args) {
	Demoz d = new Demoz();
	d.start();
	d.yield();
	for(int i=1; i<=5; i++) {
		System.out.println("Main Thread");
	}
}
}
