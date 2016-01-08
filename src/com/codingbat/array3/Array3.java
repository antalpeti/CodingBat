package com.codingbat.array3;


/**
 * The class Array3 is contains solution for Array-3 section.
 */
class Array3 {

  /**
   * Consider the leftmost and rightmost appearances of some value in an array. We'll say that the
   * "span" is the number of elements between the two inclusive. A single value has a span of 1.
   * Returns the largest span found in the given array. (Efficiency is not a priority.)
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int maxSpan(int[] numbers) {
    int maxSpan = 0;

    for (int i = 0; i < numbers.length; i++) {
      int actSpan = 0;
      for (int j = i; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          actSpan = j + 1 - i;
        }
      }
      maxSpan = maxSpan < actSpan ? actSpan : maxSpan;
    }

    return maxSpan;
  }
}
