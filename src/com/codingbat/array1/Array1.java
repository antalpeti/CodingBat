package com.codingbat.array1;

/**
 * The class Array1 is contains solution for Array-1 section.
 */
public class Array1 {

  /**
   * Given an array of ints, return true if 6 appears as either the first or last element in the
   * array. The array will be length 1 or more.
   *
   * @param numbers the input numbers
   * @return true, if the above described condition fulfilled
   */
  public boolean firstLast6(int[] numbers) {
    int firstIndex = 0;
    int lastIndex = numbers.length - 1;
    int searchedNumber = 6;
    return numbers[firstIndex] == searchedNumber || numbers[lastIndex] == searchedNumber;
  }

  /**
   * Given an array of ints, return true if the array is length 1 or more, and the first element and
   * the last element are equal.
   *
   * @param nums the input numbers
   * @return true, if the above described condition fulfilled
   */
  public boolean sameFirstLast(int[] nums) {
    int firstIndex = 0;
    int lastIndex = nums.length - 1;
    return nums.length > firstIndex && nums[firstIndex] == nums[lastIndex];
  }

  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
   *
   * @return the above defined array
   */
  public int[] makePi() {
    int[] piNumbers = new int[] {3, 1, 4};
    return piNumbers;
  }

}
