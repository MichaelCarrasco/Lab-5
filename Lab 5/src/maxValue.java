import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class maxValue {

	public static void main(String[] args) throws Exception {
	    String fileName="C:\\Users\\Michael\\Documents\\input.csv";
	    File f = new File(fileName);
	    Scanner fileScan = new Scanner(f);

	    for (int i = 1; fileScan.hasNext(); i++) {
	        String line = fileScan.nextLine();
	        System.out.printf("ROW %d: %d%n", i, extractMaximum(line));
	    }
	    fileScan.close();
	}
		    
		
		   

	static int extractMaximum(String str)
	{
	     return Arrays.stream(str.split("\\D+"))
	                    .map(x -> Integer.parseInt(x))
	                    .max(Integer::compare)
	                    .get();
	}

}
