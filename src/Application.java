import java.util.Scanner;

/**
 * Class that takes user input in the form of a string and tests if the string is a palindrome
 * users can enter 1 to continue entering strings, or 2 to quit
 * extends the PalindromeChecker class to use the isPalindrome method
 * @author cstirneman
 *
 */
public class Application extends PalindromeChecker{

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int quitFlag = 0; // value that will determine if the program continues or quits.
		
	while (quitFlag != 2) {
		Scanner scan = new Scanner(System.in);
		String palindrome; //holds users input
		
		System.out.println("Enter your palindrome: ");
		palindrome = scan.nextLine(); //uses scanner to take user input and put it into palindrome string variable
		
		boolean isPalindrome = PalindromeChecker.isPalindrome(palindrome); // uses isPalindrome method to test string for a palindrome
		
		if (isPalindrome) {
			System.out.println(palindrome + " is a palindrome!"); //prints if string is a palindrome
			
		}
		else {
			System.out.println(palindrome + " is not a palindrome!"); //prints if string is not a palindrome
		}
		System.out.println("Enter 1 to enter another palindrome, or enter 2 to quit.");
		palindrome = scan.nextLine();
		
		if(palindrome.equals("2")) {
			System.out.println("Thank you! Closing program."); //prints if user enters 2. closes program
			quitFlag =+ 2;
		}
		if (!palindrome.equals("1") && !palindrome.equals("2")) {
			System.out.println("That is not a valid input. Closing Program!");
			quitFlag =+2;
		}
	}
	
	}

}
