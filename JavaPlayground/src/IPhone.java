
public class IPhone extends Phone implements CE{

	@Override
	public void call() {
		System.out.println("Call of Iphone");
		
	}

	@Override
	public void sms() {
		System.out.println("SMS of Iphone");
		
	}
	
	public void process1() {
		System.out.println("IPhone-- CE-- P1");
	}
	
	public void process2() {
		System.out.println("IPhone-- CE-- P2");
	}

	

}
