class Threaddemo extends Thread{
	public  void run() {
		for(int i=1; i<=0;i++) {
			
		}
	
	}
}
public class demothrread2 {
public static void main(String[] args) {
	Threaddemo td= new Threaddemo();
	Thread t = new Thread(td);
	td.start();
	for(int i =1; i<=10;i++) {
		System.out.println("Main Thread");
	}
}
}
