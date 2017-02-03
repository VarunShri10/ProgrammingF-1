/*
 * 		Object : JUnit Test Cases for All Program of PF-1
 * 		Date : 17-01-2017
 * 
 */

import static org.junit.Assert.*;

import org.hamcrest.core.IsAnything;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test				// Test for Binary To Octal Conversion Program
	public void test1() {
		Binary object=new Binary();
		assertEquals(65, object.convertBinaryToOctal(110101));	
	}
	
	@Test				// Test for Removing Duplicate Array Element
	public void test2() {
		DuplicateElement object=new DuplicateElement();
		int arrayInput[]={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int expectedResult[]={2,5,4,6,3,8,9,0};
		assertArrayEquals(expectedResult, object.removeDuplicate(arrayInput));	
	}
	
	@Test			// Test for Checking Increasing Sequence
	public void test3() {
		IncreasingSequence object=new IncreasingSequence();
		int arrayInput[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int expectedResult[]={1,2,4,5,6,7,8,9};
		assertArrayEquals(expectedResult, object.longestSequence(arrayInput));
	}
	
	@Test			// Test for check FCFS program
	public void test4() {
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		FCFS object=new FCFS();
		int resultantArray[][]=object.checkFCFS(arrival_time,job_size);
		int expectedArray[][]={{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		for(int i=0;i<job_size.length;i++){
			assertArrayEquals(expectedArray[i], resultantArray[i]);
		}
	}
	
	@Test				// Test for Check Order of Array
	public void test5() {
		SortedArray object=new SortedArray();
		int arrayInput1[]={6,5,4,3,1,2,3,2};
		int arrayInput2[]={1,2,3,4,5};
		int arrayInput3[]={5,4,3,2,1};
		assertEquals(0,object.check(arrayInput1));
		assertEquals(1,object.check(arrayInput2));
		assertEquals(2,object.check(arrayInput3));
	}
	
	@Test				// Test for Join Two Sorted Array Program
	public void test6() {
		JoinSortArray object=new JoinSortArray();
		int firstArray[]={2,3,4,5};
		int secondArray[]={1,2,3,4,5,6,7};
		int result[]=new int[firstArray.length+secondArray.length];
		int expectedArray[]={1,2,2,3,3,4,4,5,5,6,7};
		result=object.join(firstArray,firstArray.length,secondArray,secondArray.length,result);
		assertArrayEquals(expectedArray, result);
	}
}
