
public class MySubClass extends MySuperClass{
	

	int x=20;
	
	public void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
	
	public void m1() {
		super.m1();
		System.out.println("Sub CLass -- m1()");
	}
	
	public MySubClass() {
		super(24);
	}
	
	

}
