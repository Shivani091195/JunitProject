package Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import Code.Calculator;

public class AnnotationsExample {
	
	@BeforeAll
	public static void beforeall()
	{
		System.out.println("Before All");
	}
	
	@RepeatedTest(10)
	public void test1()
	{
		int result = Calculator.add(78, 23);
		Assertions.assertEquals(101,result);
		System.out.println("Result : "+result);
	}
	
	@BeforeEach()
	public void beforejunit()
	{
		System.out.println("Before Junits");
	}
	
	@AfterEach()
	public void afterjunit()
	{
		System.out.println("After Junits");
	}
	
	@AfterAll
	public static void afterall()
	{
		System.out.println("After all");
	}
	

}
