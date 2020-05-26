
public class Demothread {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread t = new Thread ("Class Thread");
	System.out.println(t.getName());
	t.setName("Hello Thread");
	System.out.println(t.getName());
	t.currentThread().setName("New Main Thread");
	System.out.println(Thread.currentThread().getName());
}
}