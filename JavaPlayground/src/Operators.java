
public class Operators {

	public static void main(String[] args) {
		
//		Assignemnt Operators 
		
		int a=10;
		System.out.println(a);
		a+=3; // a=a+3
		System.out.println(a);
//		a-=3 | a*=3 | a/=3
		
//		Logical Operators 
		
		boolean goodCreditScore=false;
		boolean isStudent=true;
		boolean employed=false;
		
		if( goodCreditScore && !isStudent && employed) {
			System.out.println("Emp --Loan can be approved");
		}
		else if((isStudent && goodCreditScore) || employed) {
			System.out.println("Student --Loan can be approved");
		}
		else {
			System.out.println("Loan cannot be approved");
		}
		
//		Ternary Operator 
		
		int x=10;
		int y=20;

		
//		type variable = (condition) ? result_if_condition_is_true : result_if_condition_is_false;
		
		int min=(x<y)?x:y;
		
		System.out.println("Min value in x and y is: "+min);

	}

}
