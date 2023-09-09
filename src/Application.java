import java.util.Scanner;

public class Application extends PalindromeChecker{

	public static void main(String[] args) {
		int quitFlag = 0;
		
	while (quitFlag != 2) {
		Scanner scan = new Scanner(System.in);
		String palindrome;
		
		System.out.println("Enter your palindrome: ");
		palindrome = scan.nextLine();
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(palindrome);
		
		if (isPalindrome) {
			System.out.println(palindrome + " is a palindrome!");
			
		}
		else {
			System.out.println(palindrome + " is not a palindrome!");
		}
		System.out.println("Enter 1 to enter another palindrome, or enter 2 to quit.");
		palindrome = scan.nextLine();
		
		if(palindrome.equals("2")) {
			System.out.println("Thank you! Closing program.");
			quitFlag =+ 2;
		}
	}
	
	}

}
