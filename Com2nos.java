import java.util.Scanner;

public class Com2nos{
	public static void main(String[] args) {
		
		int n1,n2;
		Scanner inputDevice = new Scanner(System.in) ;
		
		System.out.print("Enter first number: ") ;
		n1 = inputDevice.nextInt() ;
		System.out.print("Enter second number: ") ;
		n2 = inputDevice.nextInt() ;
				 
	     if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
	     } else if (n1 < n2) {
            System.out.println(n1 + " is less than " + n2);
        } else {
            System.out.println(n1 + " is equal to " + n2);
        }
		
	}
}