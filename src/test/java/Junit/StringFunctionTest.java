package Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Code.StringFunctions;

public class StringFunctionTest {
	
	@Test
	public void test1()
	{
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}

	@Test
	public void test2()
	{
		Assertions.assertFalse(StringFunctions.isPalindrome("Shivani"));
	}
}