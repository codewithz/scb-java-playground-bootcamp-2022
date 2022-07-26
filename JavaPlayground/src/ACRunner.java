
public class ACRunner {

	public static void main(String[] args) {
	
		
		Car c;
//		c=new Car();
		
		HondaCity hc=new HondaCity();
		hc.m1();
		hc.start();
		hc.stop();
		
		System.out.println("-------------------------------");
		
		c=new HondaCity();
		c.start();
		c.stop();

	}

}
