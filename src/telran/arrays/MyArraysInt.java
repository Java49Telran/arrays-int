package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		//adds num at the array's end
		//returns new array with added number
		//using standard method Arrays.copyOf
		int [] result = Arrays.copyOf(array, array.length + 1);
		result[array.length] = num;
		return result;
	}
	public static int[] removeNumber(int [] array, int index) {
		//removes element at a given index for right index value [0 - array.length-1]
		// and returns new array with no the removed one
		//returns the source array for a wrong index value
		//(less than 0 or greater than array.length - 1
		//using the standard method System.arraycopy
		int [] result = array;
		if (index > -1 && index < array.length) {
			result = new int[array.length - 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index + 1, result, index, result.length - index);
		}
		return result;
	}
	public static int[] insertNumber(int [] array, int index, int num) {
		//inserts a given num at a given index for right value of the index [0 - array.length]
		// and returns new array with the inserted number
		//return the source array for a wrong index value
        // (less than 0 or greater than array.length)
		//using the standard method System.arraycopy
		int [] result = array;
		if (index > -1 && index <= array.length) {
			result = new int[array.length + 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index + 1, array.length - index);
			result[index] = num;
		}
		return result;
	}
	
}
