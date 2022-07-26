
public class Loops {

	public static void main(String[] args) {
		
//		1. Initialization 
//		2. Condition
//		3. Increment / Decrement
		
		System.out.println("------------ while loop ------------");
		
		int x=1;
		
		while(x<=10) {
			System.out.println(x);
			x++;
			}
		
		System.out.println("------- do while loop -----------");
		
		int y=20;
		
		do {
			System.out.println(y);
		}
		while(y<=10);
		
		System.out.println("------------ for loop -----------");
		
		for(int z=1;z<=12;z++) {
			System.out.println(z);
		}
		
		System.out.println("-------- Jump Statements ------------");
		
		boolean successful=true;
		
		for (int attempt=1;attempt<=5;attempt++) {
			
			System.out.println("Attempting to Send a message");
			
			if(attempt==2 && successful){
				System.out.println("Message Sent successfully");
				break;
			}
		}
		
		
		
		
		
		
	}
}
