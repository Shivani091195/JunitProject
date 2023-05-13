package Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import Code.StringFunctions;

public class StringFunctionTest {
	
	@Test
	@Tag("Regression")
	public void test1()
	{
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}

	@Test
	@Tag("Regression")
	public void test2()
	{
		Assertions.assertFalse(StringFunctions.isPalindrome("Shivani"));
	}
}
