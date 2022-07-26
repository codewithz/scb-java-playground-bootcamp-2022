
public class MethodsRunner {
	
	public static void main(String[] args) {
		
		MyMethods obj=new MyMethods();
		
		obj.display();
		
		obj.add(1, 2);
		
		int tax=obj.getTaxRate();
		System.out.println("Tax Rate is:"+tax);
		
		int sq=obj.calculateSquare(4);
		System.out.println("Square is : "+sq);
		
	}

}
