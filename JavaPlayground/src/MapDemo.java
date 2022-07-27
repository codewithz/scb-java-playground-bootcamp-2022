import java.util.*;
public class MapDemo 
{
	
	public static void main(String[] args) {
		
//		Map<Key,Value> object=......
		Map<Integer,String> hMap=new HashMap<>();
		hMap.put(101,"Tom");
		hMap.put(103,"Alex");
		hMap.put(104,"Mike");
		hMap.put(105,"John");
		hMap.put(102,"Penny");
		hMap.put(106,"Elizabeth");
		hMap.put(103,"Alex");
		
		System.out.println(hMap);
		
		Map<Integer,String> lhMap=new LinkedHashMap<>();
		lhMap.put(101,"Tom");
		lhMap.put(103,"Alex");
		lhMap.put(104,"Mike");
		lhMap.put(105,"John");
		lhMap.put(102,"Penny");
		lhMap.put(106,"Elizabeth");
		lhMap.put(103,"Alex");
		
		System.out.println(lhMap);
		
		Map<Integer,String> tMap=new TreeMap<>();
		tMap.put(105,"John");
		tMap.put(102,"Penny");
		tMap.put(106,"Elizabeth");
		tMap.put(103,"Alex");
		tMap.put(101,"Tom");
		tMap.put(103,"Alex");
		tMap.put(104,"Mike");
		
		
		System.out.println(tMap);
		
	}

}
