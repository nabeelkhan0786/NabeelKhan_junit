package junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SwapTest {

	/*
	 * 
	 * 
	 */
	RemoveFirst2a rem;
	
	@BeforeEach
	void setup()
	{
		rem=new RemoveFirst2a();
	}
	@Test
	void test2Chars() {
		String result=rem.remove("AB");
		assertEquals("B", result);
	}
	
	@Test
	void test4Chars() {
		String result=rem.remove("AABC");
		assertEquals("BC", result);
	}
	@Test
	void testNChars() {
		String result=rem.remove("DABCHUEBC");
		assertEquals("DBCHUEBC", result);
	}
	@Test
	void test0Chars() {
		String result=rem.remove("");
		assertEquals("", result);
	}
	


	}


