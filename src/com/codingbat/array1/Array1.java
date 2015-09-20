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
   * @return true, if the above mentioned condition fulfilled
   */
  public boolean firstLast6(int[] numbers) {
    int firstIndex = 0;
    int lastIndex = numbers.length - 1;
    int searchedNumber = 6;
    return numbers[firstIndex] == searchedNumber || numbers[lastIndex] == searchedNumber;
  }
}
