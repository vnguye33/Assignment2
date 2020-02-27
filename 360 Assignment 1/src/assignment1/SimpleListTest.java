package assignment1;
/*
 * Van Nguyen
 * Class ID# 430
 * 2/10/20
 * 
 * this is the JUNIT TESTING where it will test two situations one that passes 
 * and one that fails the test cases
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	
	@Test
	//testing the case for count that works
	public void testscount1() {
		SimpleList test1 = new SimpleList();
		test1.add(6);
		test1.add(4);
		test1.add(3);
		int count = test1.count();
		assertEquals(3, count);
		
	}
	
	//testing the case for where it fails;
	@Test
	public void testcount2() {
		SimpleList test2 = new SimpleList();
		test2.add(1);
		test2.add(4);
		test2.add(3);
		int count = test2.count();
		assertEquals(2,count);
	}
	
	//testing the case for where the add passes
	@Test
	public void testAdd1() {
		SimpleList test1 = new SimpleList();
		test1.add(1);
		test1.add(3);
		test1.add(5);
		test1.add(7);
		int count = test1.count();
		assertEquals(4,count);
		
		// this checks to see if the number being added is going to 
		// the first index of the array
		test1.add(6);
		count = test1.count();
		assertEquals(5,count);
		int index = test1.search(5);
		assertEquals(0,index);
	
	}
	
	//testing the case for where the add fails
	@Test
	public void testAdd2() {
		SimpleList test2 = new SimpleList();
		test2.add(1);
		test2.add(3);
		test2.add(5);
		test2.add(7);
		int count = test2.count();
		assertEquals(4,count);
		
		// this checks to see if the number being added is going to 
		// the first index of the array
		test2.add(6);
		count = test2.count();
		assertEquals(5,count);
		int index = test2.search(5);
		assertEquals(3,index);
	
	}
	
	//testing where the remove passes
	public void testremove1() {
		SimpleList test1 = new SimpleList();
		test1.add(1);
		test1.add(3);
		test1.add(5);
		test1.add(7);
		test1.remove(5);
		int search = test1.search(5);
		assertEquals(-1,search);		
	}
	
	//testing where the remove fails
	public void testremove2() {
		SimpleList test2 = new SimpleList();
		test2.add(1);
		test2.add(4);
		test2.add(5);
		test2.add(7);
		test2.add(6);
		test2.add(3);
		test2.remove(5);
		int search = test2.search(5);
		assertEquals(4,search);		
	}
	
	//testing where the search passes
	@Test
	public void testSearch1() {
		SimpleList test1 = new SimpleList();
		test1.add(1);
		test1.add(3);
		test1.add(5);
		test1.add(7);
		int search = test1.search(3);
		assertEquals(1,search);
	}
	
	//testing where the search fails
	@Test
	public void testSearch2() {
		SimpleList test2 = new SimpleList();
		test2.add(1);
		test2.add(3);
		test2.add(5);
		test2.add(7);
		int search = test2.search(3);
		assertEquals(2,search);
	}
			
}
