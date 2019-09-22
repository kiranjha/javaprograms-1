
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread threadRef = Thread.currentThread();
		System.out.println("Current Thread"+threadRef);
		threadRef.setName("MyThread");
		System.out.println("Current Thread"+threadRef);
		threadRef.setName("Custom");
		System.out.println("Current Thread"+threadRef);
	}

}
