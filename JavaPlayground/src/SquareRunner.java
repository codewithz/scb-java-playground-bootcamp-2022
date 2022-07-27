
public class SquareRunner {

	public static void main(String[] args) {
	
		try {
		Square sq=new Square();
		sq.setLength(-20);
		sq.area();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Execution Continues......");

	}

}
