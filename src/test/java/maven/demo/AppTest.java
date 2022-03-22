package maven.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void TestCase() {
		assertEquals(10,10);
	}
	
	@Test
	public void TestCase2() {
		App a=new App();
		assertEquals(a.m1(),"Hello");
	}
}

