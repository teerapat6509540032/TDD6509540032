package core;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack extends TestCase {
	@Test
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	//TC2
	@Test
	public void testPushElmToTop() throws Exception {
		Stack s1 = new Stack(20);
		s1.push(1);
		s1.push(2);
		
		assertEquals(2, s1.top());
		assertFalse(s1.isFull());
	}
	//TC3
	@Test
	public void testLastInFirstOut() throws Exception {
		Stack s1 = new Stack(20);
		Object dataIn[] = new Object[3];
		Object dataOut[] = new Object[3];
		Object In[] = {1,2,3};
		Object Out[] = {3,2,1};
		for(int i = 0; i < 3 ; i++) {
			s1.push(i+1);
			dataIn[i] = i+1;
		}
		
		for(int i = 0; i < 3; i++) {
			dataOut[i] = s1.pop();
		}
		
		assertArrayEquals(In, dataIn);
		assertArrayEquals(Out, dataOut);
	}
	
//	@Test
//	public void testPushToFullStack() throws Exception {
//		Stack s1 = new Stack(3);
//		for(int i = 0; i < 3 ; i++) {
//			s1.push(i+1);
//		}
//
//	}
	
	
	
//	@Test
//	public void testPushDifferentElmTypeToStack() {
//		Stack s1 = new Stack(20);
//		try {
//			s1.push(1);
//			s1.push(true);
//		}
//		catch(Exception e){
//			
//			
//		}
//	}

}
