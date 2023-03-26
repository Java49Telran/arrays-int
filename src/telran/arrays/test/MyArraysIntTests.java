package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyArraysIntTests {

	@Test
	void testAddNumber() {
		//TODO
	}

	@Test
	void testRemoveNumber() {
		//TODO
	}

	@Test
	void testInsertNumber() {
		//TODO
	}
	@Test
	void testCopyOf() {
		int array[] = {1, 2, 3};
		int expected1[] = {1, 2, 3};
		int expected2[] = {1};
		int expected3[] = {1, 2, 3, 0, 0, 0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array,6));
	}
	@Test
	void testArraycopy() {
		int array[] = {1, 2, 3};
		int expected[] = {5, 10, 1, 2, 20};
		int arrayDest[] = new int[5];
		arrayDest[4] = 20;
		int array1[] = {2, 5, 10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		
		assertArrayEquals(expected, arrayDest);
	}
	@Test
	void testBinarySearchInt() {
		//Arrays.binarySearch(int[] array,int number)
		//TODO
		//Write tests for standard method binarySearch of the class Arrays taking array of ints and int number
		
	}
	
	
	
	
	
	

}
