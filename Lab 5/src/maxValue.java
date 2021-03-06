import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class maxValue {

	public static void main(String[] args) throws Exception {
	    String fileName="C:\\Users\\Michael\\Documents\\input.csv";
	    File f = new File(fileName);
	    Scanner fileScan = new Scanner(f);
	    System.out.println("Maximum values");

	    for (int i = 1; fileScan.hasNext(); i++) {
	        String line = fileScan.nextLine();
	        System.out.printf("ROW %d: %d%n", i, extractMaximum(line)); //prints out the max value per row
	    }
	    fileScan.close();
	}
		    
		
		   

	static int extractMaximum(String str)
	{
	     return Arrays.stream(str.split("\\D+")) //calculates our max value in the string
	                    .map(x -> Integer.parseInt(x))
	                    .max(Integer::compare)
	                    .get();
	}

}

