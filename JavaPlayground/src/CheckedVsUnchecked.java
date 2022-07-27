import java.io.FileReader;

public class CheckedVsUnchecked {
	public static void main(String[] args) {
		
		
//		Unchecked Exception
		int[] iArray=new int[3];
//		iArray[5]=10;
		
//		Checked Exception
		try {
		FileReader fr=new FileReader("somefile.txt");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
			System.out.println("--------------------");
			
			e.printStackTrace();
		}
		
	}

}
