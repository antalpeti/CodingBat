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

  /**
   * Given an array of ints, return true if the array is length 1 or more, and the first element and
   * the last element are equal.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned condition fulfilled
   */
  public boolean sameFirstLast(int[] numbers) {
    int firstIndex = 0;
    int lastIndex = numbers.length - 1;
    return numbers.length > firstIndex && numbers[firstIndex] == numbers[lastIndex];
  }

  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
   *
   * @return the above mentioned new array
   */
  public int[] makePi() {
    int[] piNumbers = new int[] {3, 1, 4};
    return piNumbers;
  }

  /**
   * Given 2 arrays of ints, a and b, return true if they have the same first element or they have
   * the same last element. Both arrays will be length 1 or more.
   *
   * @param aNumbers the first array of numbers
   * @param bNumbers the second array of numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean commonEnd(int[] aNumbers, int[] bNumbers) {
    boolean firstElementSame = aNumbers[0] == bNumbers[0];
    boolean lastElementSame = aNumbers[aNumbers.length - 1] == bNumbers[bNumbers.length - 1];
    return firstElementSame || lastElementSame;
  }

  /**
   * Given an array of ints length 3, return the sum of all the elements.
   *
   * @param numbers the input numbers
   * @return the result of the above mentioned calculation
   */
  public int sum3(int[] numbers) {
    int sumOfNumbers = 0;
    for (int i = 0; i < numbers.length; i++) {
      sumOfNumbers += numbers[i];
    }
    return sumOfNumbers;
  }

  /**
   * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3}
   * yields {2, 3, 1}.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] rotateLeft3(int[] numbers) {
    return new int[] {numbers[1], numbers[2], numbers[0]};
  }

  /**
   * Given an array of ints length 3, return a new array with the elements in reverse order, so {1,
   * 2, 3} becomes {3, 2, 1}.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] reverse3(int[] numbers) {
    return new int[] {numbers[2], numbers[1], numbers[0]};
  }

  /**
   * Given an array of ints length 3, figure out which is larger between the first and last elements
   * in the array, and set all the other elements to be that value. Return the changed array.
   *
   * @param numbers the input numbers
   * @return the above mentioned changed array
   */
  public int[] maxEnd3(int[] numbers) {
    int max = Math.max(numbers[0], numbers[numbers.length - 1]);
    numbers = new int[] {max, max, max};
    return numbers;
  }

  /**
   * Given an array of ints, return the sum of the first 2 elements in the array. If the array
   * length is less than 2, just sum up the elements that exist, returning 0 if the array is length
   * 0.
   *
   * @param numbers the input numbers
   * @return the above mentioned result
   */
  public int sum2(int[] numbers) {
    if (numbers.length > 1) {
      return numbers[0] + numbers[1];
    } else if (numbers.length == 1) {
      return numbers[0];
    } else {
      return 0;
    }
  }

  /**
   * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle
   * elements.
   *
   * @param aNumbers the first array of numbers
   * @param bNumbers the second array of numbers
   * @return the above mentioned new array
   */
  public int[] middleWay(int[] aNumbers, int[] bNumbers) {
    return new int[] {aNumbers[1], bNumbers[1]};
  }

  /**
   * Given an array of ints, return a new array length 2 containing the first and last elements from
   * the original array. The original array will be length 1 or more.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] makeEnds(int[] numbers) {
    if (numbers.length > 0) {
      return new int[] {numbers[0], numbers[numbers.length - 1]};
    } else {
      return new int[] {};
    }
  }

  /**
   * Given an int array length 2, return true if it contains a 2 or a 3.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned condition fulfilled
   */
  public boolean has23(int[] numbers) {
    boolean arrayContains2 = numbers[0] == 2 || numbers[1] == 2;
    boolean arrayContains3 = numbers[0] == 3 || numbers[1] == 3;
    return arrayContains2 || arrayContains3;
  }

  /**
   * Given an int array length 2, return true if it does not contain a 2 or 3.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned condition fulfilled
   */
  public boolean no23(int[] numbers) {
    boolean arrayNotContains2 = numbers[0] != 2 && numbers[1] != 2;
    boolean arrayNotContains3 = numbers[0] != 3 && numbers[1] != 3;
    return arrayNotContains2 && arrayNotContains3;
  }

  /**
   * Given an int array, return a new array with double the length where its last element is the
   * same as the original array, and all the other elements are 0. The original array will be length
   * 1 or more. Note: by default, a new int array contains all 0's.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] makeLast(int[] numbers) {
    int[] result = new int[numbers.length * 2];
    result[result.length - 1] = numbers[numbers.length - 1];
    return result;
  }

  /**
   * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be
   * length 0, 1, or 2.
   *
   * @param numbers the input numbers
   * @return true, if above mentioned condition fulfilled
   */
  public boolean double23(int[] numbers) {
    int amountOf2 = 0;
    int amountOf3 = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 2) {
        amountOf2++;
      } else if (numbers[i] == 3) {
        amountOf3++;
      }
    }
    return amountOf2 == 2 || amountOf3 == 2;
  }

  /**
   * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the
   * 3 element to 0. Return the changed array.
   *
   * @param numbers the input numbers
   * @return the above mentioned changed array
   */
  public int[] fix23(int[] numbers) {
    int numberTwo = 2;
    int numberThree = 3;
    for (int i = 0; i < numbers.length - 1; i++) {
      boolean actualNumberIsTwo = numbers[i] == numberTwo;
      boolean nextNumberIsThree = numbers[i + 1] == numberThree;
      if (actualNumberIsTwo && nextNumberIsThree) {
        numbers[i + 1] = 0;
      }
    }
    return numbers;
  }
}
