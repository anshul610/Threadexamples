
class Demo extends Thread{
public void run() {
	System.out.println("Sub Thread Priority" + Thread.currentThread().getPriority());
}
}
class Prioritythread{
	public static void main(String[] args) {
		Thread.currentThread().setPriority(9);
		Demo du= new Demo();
		Demo t= new Demo();
		t.start();
		System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());
	}
}
