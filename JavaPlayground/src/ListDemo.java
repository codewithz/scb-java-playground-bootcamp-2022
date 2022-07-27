import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		
		List<String> namesList=new ArrayList<>();
		
		namesList.add("Aastha");
		namesList.add("Ajay");
		namesList.add("Aman");
		namesList.add("Devang");
		namesList.add("Devesh");
		namesList.add("Dominic");
		namesList.add("Hafsa");
		namesList.add("Girish");
		namesList.add("Poorna");
		namesList.add("Pratibha");
		namesList.add("Priya");
		namesList.add("Ritik");
		namesList.add("Rohini");
		namesList.add("Sahith");
		namesList.add("Sai Krishna");
		namesList.add("Souvik");
		namesList.add("Srijan");
		namesList.add("Thamil");
		namesList.add("Utkarsh");
		namesList.add("Vishnu");
		
		System.out.println(namesList);
		System.out.println(namesList.size());
				
		List<Integer> numbersList=new ArrayList<>();
		numbersList.add(10);
		numbersList.add(100);
		numbersList.add(1000);
		numbersList.add(10000);
		numbersList.add(100000);
//		numbersList.add("Zartab");
		
		System.out.println(numbersList);
		
//		----- Fetching using for-each---------
		System.out.println("-----------Fetching using for-each------------");
		for (String name:namesList) {
			System.out.println(name.toUpperCase());
		}
		
//		------- Fetching using Iterator------------
		System.out.println("-----------Fetching using Iterator------------");
		
		Iterator<Integer> itr=numbersList.iterator();
		
		while(itr.hasNext()) {
			Integer number=itr.next();
			System.out.println(number);
		}
		
//		List of Objects
		System.out.println("------- List of Objects-------");
		List<Circle> circles=new ArrayList<>();
		
		Circle c1=new Circle(24);
		Circle c2=new Circle(25);
		Circle c3=new Circle(26);
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		
		for(Circle c:circles) {
			c.area();
			c.circumference();
		}
	}
}
