class Great{
	synchronized void wish(String name) {
		System.out.print("Hello ::");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
		System.out.println("Welcome a very good morning");
		System.out.println("Have a nice day");
		System.out.println("");
	}
}
class Dzthread extends Thread{
	Great g;
	String name;
	public Dzthread(Great g , String name) {
		this.g=g;
		this.name=name;
	}
	public void run() {
		g.wish(name);
	}
}

public class Threadsync {
public static void main(String[] args) {
	Great g= new Great();
	Dzthread t= new Dzthread(g,"Anshul");
	Dzthread t1= new Dzthread(g,"Rahul");
	Dzthread t2= new Dzthread(g,"monica");
	Dzthread t3= new Dzthread(g,"Agrawal");
	t.start();
	t1.start();
	t2.start();
	t3.start();	
}
}
