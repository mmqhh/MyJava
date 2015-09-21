//Getting the current thread and displaying its info
public class GetCurrentThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		System.out.println("Id of current thread is: "+t.getId());
		System.out.println("Name of current thread is: "+t.getName());
		System.out.println("Priority of current thread is: "+t.getPriority());
		}
	}




