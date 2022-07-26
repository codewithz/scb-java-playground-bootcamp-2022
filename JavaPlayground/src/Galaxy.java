
public class Galaxy extends Phone implements CE{

	@Override
	public void call() {
		System.out.println("Call of Galaxy");
		
	}

	@Override
	public void sms() {
		System.out.println("SMS of Galaxy");
		
	}
	
	public void process1() {
		System.out.println("Galaxy-- CE-- P1");
	}
	
	public void process2() {
		System.out.println("Galaxy-- CE-- P2");
	}
	
	

}
