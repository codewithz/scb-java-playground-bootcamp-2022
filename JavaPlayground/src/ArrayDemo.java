
public class ArrayDemo {
	
	public static void main(String[] args) {
		
//		Declare
		
		int[] iArray;
		
//		Construct
		
		iArray=new int[6];
		
//		Initialize
		
		iArray[0]=10;
		iArray[1]=5;
		iArray[2]=3;
		iArray[3]=9;
		iArray[4]=7;
		iArray[5]=2;
		
//		Find the length of array 
		 int len=iArray.length;
		 
		 System.out.println("Size of an array is: "+len);
		
//		 Iterate through an array 
		 
		 for(int index=0;index<len;index++) {
			 System.out.println(iArray[index]);
		 }
	}

}
