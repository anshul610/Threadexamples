class Test{
public void show() throws InterruptedException {
	System.out.println("Welcome");
	System.out.println("Welcome2");
	System.out.println("Welcome3");
	System.out.println("Welcome4");
	System.out.println("Welcome5");
	System.out.println("Welcome6");
	synchronized(this) {
		System.out.println("-------------------");
		System.out.println("Now: " + Thread.currentThread().getName()+ " is waiting for technical round");
		Thread.sleep(2500);
		System.out.println("Now: " + Thread.currentThread().getName()+ " is waiting for Machine Test");
	}
}
}
class Abc extends Thread{
	Test t;
	Abc(Test t){
		this.t=t;
	}

public void run() {
try {
	t.show();	
}catch(InterruptedException e) {}
}}
class Threadsyncronizedblock {
	public static void main(String[] args) {
		Test ob= new Test();
		 Abc t1=new Abc(ob);
		Abc t2= new Abc(ob);
	    Abc t3= new Abc(ob);
		t1.setName("Duguu");
		t2.setName("Kushi");
		t3.setName("xyz");
		t1.start();	
		t2.start();
		t3.start();
	}
}