import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter first number: ");
		int num1=input.nextInt(); //stores our first input
		System.out.print("Enter second number: ");
		int num2=input.nextInt(); //stores our second input
		int greatest=DivisorCalc.gcd(num1,num2);
				System.out.print("GCD of " + num1 +" and " + num2 +" is: " + greatest); //prints out the greatest common denominator
		input.close();
		}
	
		private static int gcd(int num1, int num2) { //calculates our GCD
			 if(num2 == 0){
				 return num1;
			 }
        return gcd(num2, num1%num2);
		}

		
		
		
}


