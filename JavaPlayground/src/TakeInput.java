import java.util.Scanner;

public class TakeInput {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter your name:");
		String name=sc.next();
		
		System.out.print("Enter age:");
		int age=sc.nextInt();
		
		System.out.println(name+"---"+age);
		
		
	}

}
