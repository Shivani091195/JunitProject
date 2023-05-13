package Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Code.StringFunctions;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings = {"madam","dad","radar"})
	public void test1(String value)
	{
		Assertions.assertTrue(StringFunctions.isPalindrome(value));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0,4,6,10})
	public void test2(int num)
	{
		Assertions.assertTrue(num%2==0);
	}

}
