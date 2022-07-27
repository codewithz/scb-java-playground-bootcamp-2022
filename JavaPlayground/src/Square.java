
public class Square {
	
	int length;
	
	public void setLength(int length) throws Exception {
		
		if(length<=0) {
			throw new SquareException("Length is less than or 0");
		}
		else {
		this.length=length;
		}
	}
	
	public void area() {
		int area=(length*length);
		System.out.println("Area of Square with length ["+length+"] is "+area);
	}

}
