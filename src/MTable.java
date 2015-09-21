import java.util.Scanner;
public class MTable {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter range of number to print multiplication tables");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(c=a;c<=b;c++){
			for(d=1;d<=9;d++){
				System.out.println(c+"*"+d+"="+c*d);
			}
		}

	}

}
