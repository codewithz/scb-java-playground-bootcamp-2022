
public class Circle {

	int radius;
	
	Circle(){
		
	}
	
	Circle(int radius){
		this.radius=radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public void area() {
		double a=Math.PI*(radius*radius);
		System.out.println("Area of Circle is: "+a);
//		Math.PI=10;
	}
	
	public void circumference() {
		double c=2*Math.PI*radius;
		System.out.println("Circumference is :"+c);
	}
}


