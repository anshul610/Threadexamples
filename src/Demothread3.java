class Uthread extends Thread{
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println("Sub Thread");
		}
	}
}
public class Demothread3 {
public static void main(String[] args) {
	Uthread ut= new Uthread();
	Thread t = new Thread(ut);
	ut.start();
	for(int i=1; i<=10;i++) {
		System.out.println("main Thread");
	}
}
}
