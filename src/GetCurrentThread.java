import java.util.*;
public class GetCurrentThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		System.out.println("Id of current thread is: "+t.getId());
		System.out.println("Name of current thread is: "+t.getName());
		System.out.println("Priority of current thread is: "+t.getPriority());
		System.out.println("Enter 2 numbers to add");
		System.out.println(add(1,2));
		}
	static int add(int x,int y){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		return a+b;
	}
	}




