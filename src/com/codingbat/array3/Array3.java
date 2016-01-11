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
  int maxSpan(int[] numbers) {
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

  /**
   * Return an array that contains exactly the same numbers as the given array, but rearranged so
   * that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may
   * move. The array contains the same number of 3's and 4's, every 3 has a number after it that is
   * not a 3 or 4, and a 3 appears in the array before any 4.
   *
   * @param numbers the input numbers
   * @return the above mentioned array
   */
  int[] fix34(int[] numbers) {
    int[] positon4New = new int[numbers.length];
    int[] position4Actual = new int[numbers.length];
    int index4New = 0;
    int index4Actual = 0;
    int replaces = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 3) {
        positon4New[index4New++] = i + 1;
        replaces++;
      }
      if (numbers[i] == 4) {
        position4Actual[index4Actual++] = i;
      }
    }

    for (int i = 0; i < replaces; i++) {
      int number = numbers[positon4New[i]];
      numbers[positon4New[i]] = numbers[position4Actual[i]];
      numbers[position4Actual[i]] = number;
    }

    return numbers;
  }

  /**
   * Return an array that contains exactly the same numbers as the given array, but rearranged so
   * that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may
   * move. The array contains the same number of 4's and 5's, and every 4 has a number after it that
   * is not a 4. In this version, 5's may appear anywhere in the original array.
   *
   * @param numbers the input numbers
   * @return the above mentioned array
   */
  int[] fix45(int[] numbers) {
    int[] positionNew5 = new int[numbers.length];
    int[] poritionAct5 = new int[numbers.length];
    int indexNew5 = 0;
    int indexAct5 = 0;
    int replaces = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 4 && numbers[i + 1] != 5) {
        positionNew5[indexNew5++] = i + 1;
        replaces++;
      }
      if (numbers[i] == 5 && (i == 0 || numbers[i - 1] != 4)) {
        poritionAct5[indexAct5++] = i;
      }
    }

    for (int i = 0; i < replaces; i++) {
      int number = numbers[positionNew5[i]];
      numbers[positionNew5[i]] = numbers[poritionAct5[i]];
      numbers[poritionAct5[i]] = number;
    }

    return numbers;
  }

  /**
   * Given a non-empty array, return true if there is a place to split the array so that the sum of
   * the numbers on one side is equal to the sum of the numbers on the other side.
   *
   * @param numbers the input numbers
   * @return true, if above mentioned conditions fulfilled
   */
  boolean canBalance(int[] numbers) {
    int frontSum = 0;

    for (int i = 0; i < numbers.length - 1; i++) {
      frontSum += numbers[i];

      int backSum = 0;
      for (int j = i + 1; j < numbers.length; j++) {
        backSum += numbers[j];
      }
      if (frontSum == backSum) {
        return true;
      }
    }

    return false;
  }
}
