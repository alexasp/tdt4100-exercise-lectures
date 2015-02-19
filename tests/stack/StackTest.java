package stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

	StringStack stack;
	
	@Before
	public void setUp(){
		stack = new StringStack();
	}
	
	@Test
	public void testPush() {
		String streng = "en verdi";
		
		stack.push(streng);
		
		String fraStack = stack.pop();
		
		assertEquals(streng, fraStack);
	}
	

	@Test
	public void testPushSeveral(){
		String first = "nr1";
		String second = "nr2";
		
		stack.push(first);
		stack.push(second);
		
		assertEquals(second, stack.pop());
		assertEquals(first, stack.pop());
	}
	
}
