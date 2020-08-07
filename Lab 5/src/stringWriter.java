import java.util.Scanner;
import java.io.*;

public class stringWriter {

	public static void main(String[] args) throws IOException{
		String file = "userStrings.dat"; //file we will be writing to
		String str="";
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		System.out.println("Enter your string(s): ");
			while (!str.equalsIgnoreCase("done")) { //while the string does not = done keeps loop going
				Scanner input = new Scanner(System.in);
				str=input.nextLine();
				if(str.equalsIgnoreCase("done")) {  // if done is written ends loop and does not write "done" to file
					outFile.close();
					input.close();
				}
			outFile.print(str+"\n"); //writes string to output file
				
			}
		System.out.println ("Output file has been created: "+file);
	}
}

