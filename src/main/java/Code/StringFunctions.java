package Code;

public class StringFunctions {
	
public static boolean isPalindrome(String str) {
		
		String reversed="";
		boolean flag=false;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		if (str.equalsIgnoreCase(reversed)) {
			flag=true;
		}
		
		return flag;
	}

}
