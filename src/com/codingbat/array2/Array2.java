package com.codingbat.array2;

/**
 * The class Array2 is contains solution for Array-2 section.
 */
public class Array2 {

  /**
   * Return the number of even ints in the given array.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int countEvens(int[] numbers) {
    int numberOfEven = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        numberOfEven++;
      }
    }
    return numberOfEven;
  }

  /**
   * Given an array length 1 or more of ints, return the difference between the largest and smallest
   * values in the array.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int bigDiff(int[] numbers) {
    int minimum = numbers[0];
    int maximum = numbers[0];
    for (int number : numbers) {
      minimum = Math.min(minimum, number);
      maximum = Math.max(maximum, number);
    }
    return maximum - minimum;
  }

  /**
   * Return the "centered" average of an array of ints, which we'll say is the mean average of the
   * values, except ignoring the largest and smallest values in the array. If there are multiple
   * copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int
   * division to produce the final average. You may assume that the array is length 3 or more.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int centeredAverage(int[] numbers) {
    int minimum = numbers[0];
    int maximum = numbers[0];
    int sum = 0;
    for (int number : numbers) {
      minimum = Math.min(minimum, number);
      maximum = Math.max(maximum, number);
      sum += number;
    }
    return (sum - (minimum + maximum)) / (numbers.length - 2);
  }
}
