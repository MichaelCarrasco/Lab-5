import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(reverse(s));
		input.close();
		

	}
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}

}
