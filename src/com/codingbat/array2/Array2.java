package com.codingbat.array2;

import java.util.Arrays;

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

  /**
   * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number
   * 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do
   * not count.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int sum13(int[] numbers) {
    int sum = 0;
    int unluckyNumber = 13;
    int jumpIndex = 1;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] == unluckyNumber) {
        index += jumpIndex;
        continue;
      }
      sum += numbers[index];
    }
    return sum;
  }

  /**
   * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6
   * and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no
   * numbers.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  public int sum67(int[] numbers) {
    boolean ignoredNumbers = false;
    int sum = 0;
    int ignoredNumbersStart = 6;
    int ignoredNumbersEnd = 7;
    for (int number : numbers) {
      if (number == ignoredNumbersStart) {
        ignoredNumbers = true;
      }
      if (ignoredNumbers && number == ignoredNumbersEnd) {
        ignoredNumbers = false;
        continue;
      }
      if (ignoredNumbers) {
        continue;
      }
      sum += number;
    }
    return sum;
  }

  /**
   * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean has22(int[] numbers) {
    int searchedNumber = 2;
    int indexLeap = 1;
    for (int index = 0; index < numbers.length - indexLeap; index++) {
      int nextIndex = index + indexLeap;
      if (numbers[index] == searchedNumber && numbers[nextIndex] == searchedNumber) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if the array contains no 1's and no 3's.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean lucky13(int[] numbers) {
    for (int number : numbers) {
      if (number == 1 || number == 3) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean sum28(int[] numbers) {
    int searchedNumber = 2;
    int sumOfSearchedNumber = 0;
    int limitOfSum = 8;
    for (int number : numbers) {
      if (number == searchedNumber) {
        sumOfSearchedNumber += searchedNumber;
      }
      if (sumOfSearchedNumber > limitOfSum) {
        break;
      }
    }
    return sumOfSearchedNumber == limitOfSum;
  }

  /**
   * Given an array of ints, return true if the number of 1's is greater than the number of 4's.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean more14(int[] numbers) {
    int numberOfOne = 0;
    int numberOfFour = 0;
    int firstSearchedNumber = 1;
    int secondSearchedNumber = 4;
    for (int number : numbers) {
      if (number == firstSearchedNumber) {
        numberOfOne++;
      }
      if (number == secondSearchedNumber) {
        numberOfFour++;
      }
    }
    return numberOfOne > numberOfFour;
  }

  /**
   * Given a number n, create and return a new int array of length n, containing the numbers 0, 1,
   * 2, ... n-1. The given n may be 0, in which case just return a length 0 array.
   *
   * @param number the input number
   * @return the above mentioned new array
   */
  public int[] fizzArray(int number) {
    int result[] = new int[number];
    for (int index = 0; index < result.length; index++) {
      result[index] = index;
    }
    return result;
  }

  /**
   * Given an array of ints, return true if every element is a 1 or a 4.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean only14(int[] numbers) {
    int numberOne = 1;
    int numberFour = 4;
    for (int number : numbers) {
      boolean notPermitedNumber = number != numberOne && number != numberFour;
      if (notPermitedNumber) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given a number n, create and return a new string array of length n, containing the strings "0",
   * "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note:
   * String.valueOf(xxx) will make the String form of most types. The syntax to make a new string
   * array is: new String[desired_length]
   *
   * @param number the input number
   * @return the above mentioned new array
   */
  public String[] fizzArray2(int number) {
    String result[] = new String[number];
    for (int index = 0; index < result.length; index++) {
      result[index] = String.valueOf(index);
    }
    return result;
  }

  /**
   * Given an array of ints, return true if it contains no 1's or it contains no 4's.
   *
   * @param numbers the numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean no14(int[] numbers) {
    boolean hasNumber1 = false;
    boolean hasNumber4 = false;
    for (int number : numbers) {
      if (number == 1) {
        hasNumber1 = true;
      }
      if (number == 4) {
        hasNumber4 = true;
      }
    }
    return !(hasNumber1 && hasNumber4);
  }

  /**
   * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in
   * the array, at least one of the pair is that value. Return true if the given value is everywhere
   * in the array.
   *
   * @param numbers the input numbers
   * @param value the input value
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean isEverywhere(int[] numbers, int value) {
    for (int i = 0; i < numbers.length - 1; i++) {
      boolean elementIsNotValue = numbers[i] != value;
      boolean nextElementIsNotValue = numbers[i + 1] != value;
      if (elementIsNotValue && nextElementIsNotValue) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4,
   * but not both.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean either24(int[] numbers) {
    boolean hasNextToTwo = false;
    boolean hasNextToFour = false;
    int numberTwo = 2;
    int numberFour = 4;

    for (int index = 0; index < numbers.length - 1; index++) {
      boolean elementIsTwo = numbers[index] == numberTwo;
      boolean nextElementIsTwo = numbers[index + 1] == numberTwo;
      if (elementIsTwo && nextElementIsTwo) {
        hasNextToTwo = true;
      }

      boolean elementIsFour = numbers[index] == numberFour;
      boolean nextElementIsFour = numbers[index + 1] == numberFour;
      if (elementIsFour && nextElementIsFour) {
        hasNextToFour = true;
      }
    }

    boolean onlyNextToTwo = hasNextToTwo && !hasNextToFour;
    boolean onlyNextToFour = !hasNextToTwo && hasNextToFour;
    return onlyNextToTwo || onlyNextToFour;
  }

  /**
   * Given arrays numbers1 and numbers2 of the same length, for every element in numbers1, consider
   * the corresponding element in numbers2 (at the same index). Return the count of the number of
   * times that the two elements differ by 2 or less, but are not equal.
   *
   * @param numbers1 the first input numbers
   * @param numbers2 the second input numbers
   * @return the above mentioned number
   */
  public int matchUp(int[] numbers1, int[] numbers2) {
    int result = 0;
    for (int i = 0; i < numbers1.length; i++) {
      boolean numbersNotEqual = numbers1[i] != numbers2[i];
      boolean numbersDifferLessThanTwo = Math.abs(numbers1[i] - numbers2[i]) <= 2;
      if (numbersNotEqual && numbersDifferLessThanTwo) {
        result++;
      }
    }
    return result;
  }

  /**
   * Given an array of ints, return true if the array contains two 7's next to each other, or there
   * are two 7's separated by one element, such as with {7, 1, 7}.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean has77(int[] numbers) {
    if (numbers.length == 2) {
      boolean firstElementIsSeven = numbers[0] == 7;
      boolean secondElementIsSeven = numbers[1] == 7;
      if (firstElementIsSeven && secondElementIsSeven) {
        return true;
      }
    }
    if (numbers.length > 2) {
      for (int i = 0; i < numbers.length - 2; i++) {
        boolean startElementIsSeven = numbers[i] == 7;
        boolean middleElementIsSeven = numbers[i + 1] == 7;
        boolean endElementIsSeven = numbers[i + 2] == 7;
        boolean startAndMiddleCase = startElementIsSeven && middleElementIsSeven;
        boolean middleAndEndCase = middleElementIsSeven && endElementIsSeven;
        boolean startAndEndCase = startElementIsSeven && endElementIsSeven;
        if (startAndMiddleCase || middleAndEndCase || startAndEndCase) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in
   * the array.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean has12(int[] numbers) {
    boolean hasOne = false;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 1) {
        hasOne = true;
      } else if (hasOne && numbers[i] == 2) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if the array contains either 3 even or 3 odd values all
   * next to each other.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean modThree(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
      boolean threeConsecutiveNumbersAreEven =
          numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0 && numbers[i + 2] % 2 == 0;
      if (threeConsecutiveNumbersAreEven) {
        return true;
      }
      boolean threeConsecutiveNumbersAreOdd =
          numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1 && numbers[i + 2] % 2 == 1;
      if (threeConsecutiveNumbersAreOdd) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no
   * 3's are next to each other.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean haveThree(int[] numbers) {
    int numberOfProperOccurrence = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
      boolean elementIsThree = numbers[i] == 3;
      boolean nextElementIsNotThree = numbers[i + 1] != 3;
      if (elementIsThree && nextElementIsNotThree) {
        numberOfProperOccurrence++;
      }
    }
    if (numbers.length > 1) {
      boolean beforeLastElementIsNotThree = numbers[numbers.length - 2] != 3;
      boolean lastElementIsThree = numbers[numbers.length - 1] == 3;
      if (beforeLastElementIsNotThree && lastElementIsThree) {
        numberOfProperOccurrence++;
      }
    }
    return numberOfProperOccurrence == 3;
  }

  /**
   * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean twoTwo(int[] numbers) {
    int consecutiveNumberOfTwo = 0;
    for (int i = 0; i < numbers.length; i++) {
      boolean elementIsTwo = numbers[i] == 2;
      if (elementIsTwo) {
        consecutiveNumberOfTwo++;
      } else {
        if (consecutiveNumberOfTwo == 1) {
          return false;
        } else if (consecutiveNumberOfTwo >= 2) {
          consecutiveNumberOfTwo = 0;
        }
      }
    }
    return consecutiveNumberOfTwo == 1 ? false : true;
  }

  /**
   * Return true if the group of N numbers at the start and end of the array are the same. For
   * example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for
   * n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
   *
   * @param numbers the input numbers
   * @param sameNumbersLength the examined same length
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean sameEnds(int[] numbers, int sameNumbersLength) {
    for (int i = 0; i < sameNumbersLength; i++) {
      int leftElement = numbers[i];
      int rightElement = numbers[numbers.length - sameNumbersLength + i];
      if (leftElement != rightElement) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5,
   * 6, ... or 23, 24, 25.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean tripleUp(int[] numbers) {
    for (int index = 0; index < numbers.length - 2; index++) {
      int startElement = numbers[index];
      int middleElement = numbers[index + 1];
      int endElement = numbers[index + 2];
      if (startElement + 1 == middleElement && middleElement + 1 == endElement) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given start and end numbers, return a new array containing the sequence of integers from start
   * up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will
   * be greater or equal to the start number.
   *
   * @param startNumber the start number
   * @param endNumber the end number
   * @return the above mentioned new array
   */
  public int[] fizzArray3(int startNumber, int endNumber) {
    int arrayLength = endNumber - startNumber;
    int[] result = new int[arrayLength];
    for (int index = 0; index < arrayLength; index++) {
      result[index] = startNumber + index;
    }
    return result;
  }

  /**
   * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may
   * modify and return the given array, or return a new array.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] shiftLeft(int[] numbers) {
    int[] shiftedArray = new int[numbers.length];
    int lastIndex = numbers.length - 1;
    if (shiftedArray.length > 0) {
      shiftedArray[lastIndex] = numbers[0];
      for (int index = 0; index < lastIndex; index++) {
        shiftedArray[index] = numbers[index + 1];
      }
    }
    return shiftedArray;
  }

  /**
   * For each multiple of 10 in the given array, change all the values following it to be that
   * multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2,
   * 10, 10, 10, 20, 20}.
   *
   * @param numbers the input numbers
   * @return the above mentioned array
   */
  public int[] tenRun(int[] numbers) {
    int multipleOfTen = 1;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] % 10 == 0) {
        multipleOfTen = numbers[index];
      }
      if (multipleOfTen != 1) {
        numbers[index] = multipleOfTen;
      }
    }
    return numbers;
  }

  /**
   * Given a non-empty array of ints, return a new array containing the elements from the original
   * array that come before the first 4 in the original array. The original array will contain at
   * least one 4. Note that it is valid in java to create an array of length 0.
   *
   * @param numbers the input numbers
   * @return the above mentioned new array
   */
  public int[] pre4(int[] numbers) {
    int firstPositionOfNumberFour = 0;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] == 4) {
        firstPositionOfNumberFour = index;
        break;
      }
    }
    return Arrays.copyOf(numbers, firstPositionOfNumberFour);
  }
}
