
public class StringDemo {
	
	public static void main(String[] args) {
		
		String s="Standard Chartered";
		System.out.println(s);
		
		System.out.println("---------------Concat ------------");
		
		String s1=" Bank";
		String s2=s.concat(s1);
		System.out.println(s2);
		
		String s3=s+s1;
		System.out.println(s3);
		
		System.out.println("-------- Length -----------------");
		
		int len=s.length();
		System.out.println(s+" length is "+len);
		int len1=s2.length();
		System.out.println(s2+" length is "+len1);
		
		System.out.println("----------- Equality --------------");
		
		String x1="standard chartered";
		String x2="Standard Chartered";
		
		System.out.println(x1.equals(x2)); //checks for exact match including cases
		System.out.println(s.equals(x2));
		
		System.out.println(x1.equalsIgnoreCase(x2)); //checks for exact match excluding cases
		
		System.out.println("---------- Trims and Empty CHecks-------------");
		
		String s4="   Standard Chartered   ";
		System.out.println(s4);
		String s5=s4.trim();
		System.out.println(s5);
		
		String s6="";
		System.out.println("Empty Check for s6: "+s6.isEmpty());
		System.out.println("Empty Check for s5: "+s5.isEmpty());
		
		System.out.println("---------- Index and Char at -------------");
		
		String s7="Standard";
		
		char c=s7.charAt(2);
		System.out.println("Character at index 2 is "+c);
		
		int i1=s7.indexOf("d");
		System.out.println("Index of first d is "+i1);
		
		int i2=s7.indexOf("d",i1+1);
		System.out.println("Index of second d is "+i2);
		
		int i3=s7.indexOf("z");
		System.out.println("Index of z is "+i3);
		
		System.out.println("----------- Upper and Lower Case ------------");
		
		System.out.println(x1+"----"+x1.toUpperCase());
		System.out.println(x2+"----"+x2.toLowerCase());
		
		System.out.println("-------- Replace and Split------------------");
		
		String s8="Jxvx";
		String s9=s8.replaceAll("x","a");
		System.out.println(s8+"----"+s9);
		
		String data="1,Tom,IT,Dev,350000";
		String[] dataArray=data.split(",");
		
		for(String d:dataArray) {
			System.out.println(d);
		}
		
		System.out.println("----------- Substring---------------");
		
		String s10="Hamburger";
		System.out.println(s10);
		
		String s11=s10.substring(3);
		System.out.println(s11);
		
		String s12=s10.substring(4,8);
		System.out.println(s12);
		
		System.out.println("--------- String Buffer -----------");
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append(s1);
		System.out.println(sb);
		String s13=sb.toString();
		System.out.println(s13);
		
		
		
	}

}
