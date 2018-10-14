import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String [] args) {
		Scanner Scan = new Scanner(System.in);
		try {
		System.out.println("Hello world!");
		System.out.println("Please enter two values");
		int x = Scan.nextInt();
		int y = Scan.nextInt();
		System.out.println("Sum of two values = " + (x+y));
		
		}finally {
			System.out.println("System.in strean Scan is closed in finally block ");
			Scan.close();
			}
	}
}