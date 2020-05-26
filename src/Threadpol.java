import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class Workthread implements Runnable{

	private String message;
	public Workthread(String s) {
		this.message=s;
	}
	public void run() {
	System.out.println(Thread.currentThread().getName()+"(StartStart) message = \"+message");
	processmessage();
		System.out.println(Thread.currentThread().getName()+ "(End)");
	}
	private void processmessage() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class Threadpol {
	public static void main(String[] args) {
		
ExecutorService executor= Executors.newFixedThreadPool(5);
for(int i=0; i<5; i++) {
	Runnable worker = new Workthread("" + i);
	executor.execute(worker);
}
executor.shutdown();
while (!executor.isTerminated()) {}
System.out.println("Finished all Threads");
}

}
