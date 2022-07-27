import java.util.*;
public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> hSet=new HashSet<>();
		hSet.add("D");
		hSet.add("O");
		hSet.add("M");
		hSet.add("I");
		hSet.add("N");
		hSet.add("I");
		hSet.add("C");
		
		System.out.println("Hash Set--->"+hSet);
		
		Set<String> lhSet=new LinkedHashSet<>();
		lhSet.add("D");
		lhSet.add("O");
		lhSet.add("M");
		lhSet.add("I");
		lhSet.add("N");
		lhSet.add("I");
		lhSet.add("C");
		
		System.out.println("Linked Hash Set--->"+lhSet);
		
		Set<String> tSet=new TreeSet<>();
		tSet.add("D");
		tSet.add("O");
		tSet.add("M");
		tSet.add("I");
		tSet.add("N");
		tSet.add("I");
		tSet.add("C");
		
		System.out.println("Tree Set--->"+tSet);
		
		
		
	}

}
