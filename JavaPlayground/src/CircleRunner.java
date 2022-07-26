
public class CircleRunner {
	
	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.setRadius(24);
		c1.area();
		c1.circumference();
		
		Circle c2=new Circle(25);
		c2.area();
		c2.circumference();
	}

}
