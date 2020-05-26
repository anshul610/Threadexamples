class Demoo extends Thread{
	public void run() {
		String name= Thread.currentThread().getName();
		String p= Thread.currentThread().getName();
		System.out.println("Thread " + name + " has Priority " +p);
	}
}
public class Demoth {
public static void main(String[] args) {
	Demoo d1=new Demoo();
	Demoo d2=new Demoo();
	Demoo d3=new Demoo();
	d1.setName("Demo-1");
	d2.setName("Demo-2");
	d3.setName("Demo-3");
	
	d1.setPriority(1);
	d2.setPriority(4);
	d3.setPriority(10);
	
	d1.start();
	d2.start();
	d3.start();
}
}
