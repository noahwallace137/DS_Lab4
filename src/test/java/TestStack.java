import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestStack
{
	public TestStack(){
		
		
	}
	@Test
	public void test() {
		MyStack stack = new MyStack();
		
		assertTrue(stack.isEmpty());
		stack.push("A");
		assertEquals("A", stack.top());
		
		assertFalse(stack.isEmpty());
		stack.push("B");
		assertEquals("B", stack.top());
		
		assertEquals("B", stack.pop());
		assertEquals("A", stack.top());
		stack.pop();
		assertTrue(stack.isEmpty());
		
		assertThrows(StackUnderFlowException.class, () -> {stack.pop();});
		assertThrows(StackUnderFlowException.class, () -> {stack.top();});

				

		

	}
		
	}
	

