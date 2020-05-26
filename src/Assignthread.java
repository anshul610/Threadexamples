class Demojj extends Thread{
	public void run() {
		String s= Thread.currentThread().getName();
		if(s.equals("Ans")) {
			for(int i=1; i<=5; i++) {
				try {
					System.out.println("Watching movie");
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}else {
			for(int i=1; i<=5; i++) {
				System.out.println("Sleeping");
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					System.out.println("Wake up");
				}
			}
		}
	}
}
public class Assignthread {
public static void main(String[] args) throws InterruptedException {
	
	Demojj d1= new Demojj();
	Demojj d2= new Demojj();
	d2.setName("Ans");
	d1.start();
	d2.start();
	for(int i=1; i<=5; i++) {
		d1.join();
		System.out.println("noise sound");
		
	}
}
}
