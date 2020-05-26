class Mythread4 extends Thread{
	public void run() {
		String s = Thread.currentThread().getName();
		if(s.equals("sec")) {
			for(int i=1; i<=5;i++) {
				try {
					System.out.println("D2 Thread is Running");
				  Thread.sleep(2500);
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}else {
			for(int i=0; i<=5; i++) {
				System.out.println("D1 Thread Running");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Thread Got Interrupt");
				}
		}
			
	}
}
}
public  class threadprevention {
	public static void main(String[] args) throws InterruptedException
{
	Mythread4 my = new Mythread4();
	Mythread4 my1 = new Mythread4();
	my.start();
	my1.start();
	for(int i=0; i<=5; i++) {
		my.join();
		System.out.println("Main Thread");
	}
}
}

