
public class IRunner {
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		
		System.out.println("-------------------------");
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		
		System.out.println("---------- Super Classes -----------");
		
		Class c1=b.getClass();
		System.out.println("Parent Class for B is "+c1.getSuperclass().getName());
		
		Class c2=a.getClass();
		System.out.println("Parent Class for A is "+c2.getSuperclass().getName());
		
		System.out.println("---------- Method Overriding ----------");
		
		Elephant e=new Elephant();
		e.eat();
		
		System.out.println("-------- super keyword -------------");
		
		MySubClass subClassObj=new MySubClass();
		subClassObj.display();
		subClassObj.m1();
		
		System.out.println("----- Rule of Generalization ---------");
		
		Animal animal=new Elephant();
		animal.eat();
		
		animal=new Cat();
		animal.eat();
		
	}
}
