
public class PenRunner {

	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.openCap();
		p1.write();
		p1.closeCap();
		
		System.out.println("-----------------------");
		
		Pen p2=new Pen("Red");
		p2.openCap();
		p2.write();
		p2.closeCap();
		
	}
}
