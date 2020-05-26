class Abcd{
public static void show() {
	System.out.println("Welcome");
	System.out.println("First Register2");
	System.out.println("Complete Doc");
	System.out.println("Select Departement");
	
	System.out.println("Wait for your chance");
	synchronized(Abcd.class) {
	System.out.println("Now: " + Thread.currentThread().getName()+ " is going for technical round");
	System.out.println("Now: " + Thread.currentThread().getName()+ " is going for Machine Test");
	System.out.println("Now: " + Thread.currentThread().getName()+ " can go");

	}
}
}
class UUthread extends Thread{
	Abcd ob;
	UUthread(Abcd ob){
		this.ob=ob;
	}

public void run() {

	ob.show();	

}}
public class ThreadClasslevelblock {
	public static void main(String[] args) {
		Abcd ob=new Abcd();
		UUthread t1= new UUthread(ob);
		UUthread t2= new UUthread(ob);
		UUthread t3= new UUthread(ob);
		 
		t1.setName("Duguu");
		t2.setName("Kushi");
		t3.setName("xyz");

		t1.start();	
		t2.start();
		t3.start();
	
	}
}



