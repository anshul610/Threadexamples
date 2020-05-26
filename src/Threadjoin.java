class Demoj extends Thread{
	public void run() {
		String s= Thread.currentThread().getName();
		if(s.equals("sec")) {
			for(int i=1; i<=5; i++) {
				try {
					System.out.println("D2 thread Running");
					Thread.sleep(2000);
				}catch(Exception e) {	e.printStackTrace();	}
			}
		}else {
			for(int i=1; i<=5; i++) {
				System.out.println("D1 Thread is Running");
				try {
					Thread.sleep(500);
				}catch(Exception e) {System.out.println("Thread is interrupted");}
			}
		}
	}
}
public class Threadjoin {
public static void main(String[] args) throws InterruptedException {
	
	Demoj d1= new Demoj();
	Demoj d2= new Demoj();
	d2.setName("sec");
	d1.start();
	d2.start();
	for(int i=1; i<=5; i++) {
		d1.join();
		System.out.println("Main Thread");
		
	}
}
}
