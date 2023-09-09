import java.util.Stack;

/**
 * Class that uses a stack to test if a string is a palindrome(words that read the same forward and backward
 * @author cstirneman
 *
 */
public class PalindromeChecker {

	/**
	 * Method that checks if a string is a palindrome.
	 * @param string: The string from the user that will be used to check for a palindrome.
	 * @return true if the string is a palindrome, false if it is not.
	 */
	public static boolean isPalindrome(String string) {
		//makes the string all lowercase and removes spaces
		string = string.replaceAll("\\s+","".toLowerCase());
		
		Stack<Character> stack = new Stack<>();//creating an empty stack that will hold characters
		int length = string.length();//length of the string in charcaters
		int half = length / 2;// half the length of the string to use to push to stack and compare
		
		//iterate through the first half of the array and push the characters into the stack
		for (int i = 0; i <half; i++) {
			stack.push(string.charAt(i));
		}
		if (length %2 != 0) { //if the length is odd, then add 1 to the half int value
			half++;
		}
		//start at the value of half and iterate through the string. Pop the characters from the stack and compare to the characters
		for (int i = half; i <length; i++) {
			if (stack.isEmpty() || stack.pop()!= string.charAt(i)){
					return false;
			}
			
		}
		return stack.isEmpty(); // if string is empty, then the string is a palindrome
	}
}
