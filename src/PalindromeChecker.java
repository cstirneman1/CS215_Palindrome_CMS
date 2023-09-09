import java.util.Stack;

public class PalindromeChecker {

	public static boolean isPalindrome(String string) {
		string = string.replaceAll("\\s+","".toLowerCase());
		
		Stack<Character> stack = new Stack<>();
		int length = string.length();
		int half = length / 2;
		
		for (int i = 0; i <half; i++) {
			stack.push(string.charAt(i));
		}
		if (length %2 != 0) {
			half++;
		}
		for (int i = half; i <length; i++) {
			if (stack.isEmpty() || stack.pop()!= string.charAt(i)){
					return false;
			}
			
		}
		return stack.isEmpty();
	}
}
