import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s=input.nextLine(); //string input
		System.out.println(reverse(s)); //prints out our reversed string
		input.close();
		

	}
	public static String reverse(String str) { //takes the first character of the string and outputs it until no characters are left.
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}

}
