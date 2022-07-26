
public class Pen {
	
	Pen(){
		System.out.println("Default constructor of Pen");
//		State settings can be done here
	}
	
	Pen(String color){
		System.out.println("Parameterized constructor ("+color+") of Pen");
//		State settings can be done here
	}
	
	public void openCap() {
		System.out.println("Open Cap of Pen");
	}
	
	public void write() {
		System.out.println("Write of Pen");
	}
	
	public void closeCap() {
		System.out.println("Close Cap of Pen");
	}

}
