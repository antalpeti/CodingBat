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
   * @return true, if the above mentioned condition is fulfilled
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
   * @return true, if the above mentioned condition is fulfilled
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
   * @return true, if the above mentioned condition is fulfilled
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
   * @return true, if the above mentioned condition is fulfilled
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
   * @return true, if above mentioned condition is fulfilled
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

  /**
   * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their
   * first element.
   *
   * @param aNumbers the first array of numbers
   * @param bNumbers the second array of numbers
   * @return the above mentioned number
   */
  public int start1(int[] aNumbers, int[] bNumbers) {
    int numberOfArrayStartWithOne = 0;
    if (aNumbers.length > 0 && aNumbers[0] == 1) {
      ++numberOfArrayStartWithOne;
    }
    if (bNumbers.length > 0 && bNumbers[0] == 1) {
      ++numberOfArrayStartWithOne;
    }
    return numberOfArrayStartWithOne;
  }

  /**
   * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
   * Return the array which has the largest sum. In event of a tie, return a.
   *
   * @param aNumbers the first array of numbers
   * @param bNumbers the second array of numbers
   * @return the above mentioned array
   */
  public int[] biggerTwo(int[] aNumbers, int[] bNumbers) {
    int sumOfANumbers = aNumbers[0] + aNumbers[1];
    int sumOfBNumbers = bNumbers[0] + bNumbers[1];
    return sumOfANumbers >= sumOfBNumbers ? aNumbers : bNumbers;
  }

  /**
   * Given an array of ints of even length, return a new array length 2 containing the middle two
   * elements from the original array. The original array will be length 2 or more.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] makeMiddle(int[] numbers) {
    int afterMiddleIndex = numbers.length / 2;
    return new int[] {numbers[afterMiddleIndex - 1], numbers[afterMiddleIndex]};
  }

  /**
   * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
   *
   * @param aNumbers the first array of numbers
   * @param bNumbers the second array of numbers
   * @return the above mentioned new array
   */
  public int[] plusTwo(int[] aNumbers, int[] bNumbers) {
    return new int[] {aNumbers[0], aNumbers[1], bNumbers[0], bNumbers[1]};
  }

  /**
   * Given an array of ints, swap the first and last elements in the array. Return the modified
   * array. The array length will be at least 1.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] swapEnds(int[] numbers) {
    int[] result = numbers.clone();
    int lastIndex = numbers.length - 1;
    int lastElement = numbers[lastIndex];
    int firstIndex = 0;
    int firstElement = numbers[firstIndex];
    result[firstIndex] = lastElement;
    result[lastIndex] = firstElement;
    return result;
  }

  /**
   * Given an array of ints of odd length, return a new array length 3 containing the elements from
   * the middle of the array. The array length will be at least 3.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int[] midThree(int[] numbers) {
    int middleIndex = numbers.length / 2;
    int beforeMiddleIndex = middleIndex - 1;
    int afterMiddleIndex = middleIndex + 1;
    return new int[] {numbers[beforeMiddleIndex], numbers[middleIndex], numbers[afterMiddleIndex]};
  }

  /**
   * Given an array of ints of odd length, look at the first, last, and middle values in the array
   * and return the largest. The array length will be a least 1.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int maxTriple(int[] numbers) {
    int firstIndex = 0;
    int lastIndex = numbers.length - 1;
    int middleIndex = numbers.length / 2;

    int maxNumber = numbers[firstIndex];

    if (maxNumber < numbers[lastIndex]) {
      maxNumber = numbers[lastIndex];
    } else if (maxNumber < numbers[middleIndex]) {
      maxNumber = numbers[middleIndex];
    }
    return maxNumber;
  }

  /**
   * Given an int array of any length, return a new array of its first 2 elements. If the array is
   * smaller than length 2, use whatever elements are present.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] frontPiece(int[] numbers) {
    return numbers.length > 1 ? new int[] {numbers[0], numbers[1]} : numbers;
  }

  /**
   * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if
   * the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
   *
   * @param numbers the numbers
   * @return true, if the above mentioned condition fulfilled
   */
  public boolean unlucky1(int[] numbers) {
    boolean ul =
        numbers.length < 3 ? false : numbers[0] == 1 && numbers[1] == 3 || numbers[1] == 1 && numbers[2] == 3
        || numbers[numbers.length - 2] == 1 && numbers[numbers.length - 1] == 3;
    ul = numbers.length == 2 && !ul ? numbers[0] == 1 && numbers[1] == 3 : ul;
    return ul;
  }
}
