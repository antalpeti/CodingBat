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


  /**
   * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the
   * numbers in inner appear in outer. The best solution makes only a single "linear" pass of both
   * arrays, taking advantage of the fact that both arrays are already in sorted order.
   *
   * @param outer the outer ordered array
   * @param inner the inner ordered array
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean linearIn(int[] outer, int[] inner) {
    if (inner.length == 0) {
      return true;
    }

    int innerIndex = 0;
    for (int outerIndex = 0; outerIndex < outer.length; outerIndex++) {
      if (outer[outerIndex] == inner[innerIndex]) {
        innerIndex++;
        if (innerIndex == inner.length) {
          return true;
        }
      }
    }

    return false;
  }

  /**
   * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0,
   * 1, 0, 2, 1, 3, 2, 1} (spaces added to show the 3 groups).
   *
   * @param number the input number
   * @return the above mentioned new array
   */
  int[] squareUp(int number) {
    int[] result = new int[number * number];
    int index = 0;
    int notZeroBoundary = 0;

    for (int i = 0; i < number; i++) {
      notZeroBoundary++;
      for (int j = number; j > 0; j--) {
        if (j <= notZeroBoundary) {
          result[index] = j;
        } else {
          result[index] = 0;
        }
        index++;
      }
    }

    return result;
  }

  /**
   * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} (spaces added
   * to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is
   * known to sum to exactly n*(n + 1)/2.
   *
   * @param number the input number
   * @return the above mentioned new array
   */
  int[] seriesUp(int number) {
    int[] result = new int[number * (number + 1) / 2];

    int index = 0;
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        result[index++] = j;
      }
    }

    return result;
  }

  /**
   * We'll say that a "mirror" section in an array is a group of contiguous elements such that
   * somewhere in the array, the same group appears in reverse order. For example, the largest
   * mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of
   * the largest mirror section found in the given array.
   *
   * @param numbers the input numbers
   * @return the above mentioned new nubmer
   */
  int maxMirror(int[] numbers) {
    int length = numbers.length;
    int count = 0;
    int maxMirror = 0;

    for (int i = 0; i < length; i++) {
      count = 0;
      for (int j = length - 1; i + count < length && j > -1; j--) {
        if (numbers[i + count] == numbers[j]) {
          count++;
        } else {
          if (count > 0) {
            maxMirror = Math.max(count, maxMirror);
            count = 0;
            j++;
          }
        }
      }
      maxMirror = Math.max(count, maxMirror);
    }

    return maxMirror;
  }
}
