package com.codingbat.recursion1;

/**
 * The class Recursion1 is contains solution for Recursion-1 section.
 */
public class Recursion1 {

  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
   * result recursively (without loops).
   *
   * @param number the input number
   * @return the above mentioned new number
   */
  int factorial(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return number * factorial(number - 1);
  }

  /**
   * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the
   * total number of ears across all the bunnies recursively (without loops or multiplication).
   *
   * @param bunnies the number of bunnies
   * @return the above mentioned new number
   */
  int bunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

  /**
   * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive
   * definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each
   * subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2,
   * 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth
   * fibonacci number, with n=0 representing the start of the sequence.
   *
   * @param fibonacciIndex the fibonacci index
   * @return the above mentioned new number
   */
  int fibonacci(int fibonacciIndex) {
    if (fibonacciIndex == 0) {
      return 0;
    }
    if (fibonacciIndex == 1) {
      return 1;
    }
    return fibonacci(fibonacciIndex - 1) + fibonacci(fibonacciIndex - 2);
  }

  /**
   * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
   * the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the
   * total number of blocks in such a triangle with the given number of rows.
   *
   * @param rows the rows of triangles
   * @return the above mentioned new number
   */
  int triangle(int rows) {
    if (rows == 0) {
      return 0;
    }
    return rows + triangle(rows - 1);
  }

  /**
   * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod
   * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
   * rightmost digit (126 / 10 is 12).
   *
   * @param number the input number
   * @return the above mentioned new number
   */
  int sumDigits(int number) {
    int rightmostDigit = number % 10;
    int rightmostDigitRemoved = number / 10;
    if (rightmostDigitRemoved == 0) {
      return rightmostDigit;
    }
    return rightmostDigit + sumDigits(rightmostDigitRemoved);
  }

  /**
   * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example
   * 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
   * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   *
   * @param number the input number
   * @return the above mentioned new number
   */
  int count7(int number) {
    int rightmostDigit = number % 10;
    int rightmostDigitRemoved = number / 10;
    if (rightmostDigit == 7) {
      return 1 + count7(rightmostDigitRemoved);
    }
    if (rightmostDigitRemoved == 0) {
      return 0;
    }
    return count7(rightmostDigitRemoved);
  }

  /**
   * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as
   * a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields
   * 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
   * removes the rightmost digit (126 / 10 is 12).
   *
   * @param number the input number
   * @return the above mentioned new number
   */
  int count8(int number) {
    int rightmostDigit = number % 10;
    int rightmostDigitRemoved = number / 10;
    int beforeRightmostDigit = rightmostDigitRemoved % 10;
    if (beforeRightmostDigit == 8 && rightmostDigit == 8) {
      return 2 + count8(rightmostDigitRemoved);
    }
    if (beforeRightmostDigit != 8 && rightmostDigit == 8) {
      return 1 + count8(rightmostDigitRemoved);
    }
    if (rightmostDigitRemoved == 0) {
      return 0;
    }
    return count8(rightmostDigitRemoved);
  }

  /**
   * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to
   * the n power, so powerN(3, 2) is 9 (3 squared).
   *
   * @param base the base number
   * @param exponent the exponent
   * @return the above mentioned new number
   */
  int powerN(int base, int exponent) {
    if (exponent == 1) {
      return base;
    }
    return base * powerN(base, exponent - 1);
  }

  /**
   * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int countX(String text) {
    if (text.length() == 0) {
      return 0;
    }
    String substring = text.substring(1);
    if (text.charAt(0) == 'x') {
      return 1 + countX(substring);
    }
    return countX(substring);
  }

  /**
   * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in
   * the string.
   *
   * @param text the input {@link String}
   * @return the above mentioned new number
   */
  int countHi(String text) {
    if (text.length() == 0) {
      return 0;
    }
    String substring = text.substring(1);
    if (text.startsWith("hi")) {
      return 1 + countHi(substring);
    }
    return countHi(substring);
  }

  /**
   * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
   * have been changed to 'y' chars.
   *
   * @param text the input {@link String}
   * @return the above mentioned new {@link String}
   */
  String changeXY(String str) {
    String front = "";
    if (str.length() == 0) {
      return front;
    }
    if (str.charAt(0) == 'x') {
      return 'y' + changeXY(str.substring(1));
    }
    return str.charAt(0) + changeXY(str.substring(1));
  }

  /**
   * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have
   * been replaced by "3.14".
   *
   * @param str the input {@link String}
   * @return the above mentioned new string
   */
  String changePi(String str) {
    if (str.length() == 0) {
      return "";
    }
    if (str.startsWith("pi")) {
      return "3.14" + changePi(str.substring(2));
    }
    return str.charAt(0) + changePi(str.substring(1));
  }

  /**
   * Given a string, compute recursively a new string where all the 'x' chars have been removed.
   *
   * @param str the input {@link String}
   * @return the above mentioned new string
   */
  String noX(String str) {
    if (str.length() == 0) {
      return "";
    }
    if (str.charAt(0) == 'x') {
      return noX(str.substring(1));
    }
    return str.charAt(0) + noX(str.substring(1));
  }

  /**
   * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention
   * of considering only the part of the array that begins at the given index. In this way, a
   * recursive call can pass index+1 to move down the array. The initial call will pass in index as
   * 0.
   *
   * @param nums the array of numbers
   * @param index the starting index
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean array6(int[] nums, int index) {
    if (nums.length == 0 || nums.length == index) {
      return false;
    }
    if (nums[index] == 6) {
      return true;
    }
    return array6(nums, index + 1);
  }

  /**
   * Given an array of ints, compute recursively the number of times that the value 11 appears in
   * the array. We'll use the convention of considering only the part of the array that begins at
   * the given index. In this way, a recursive call can pass index+1 to move down the array. The
   * initial call will pass in index as 0.
   *
   * @param nums the array of numbers
   * @param index the starting index
   * @return the above mentioned new number
   */
  int array11(int[] nums, int index) {
    if (nums.length == 0 || nums.length == index) {
      return 0;
    }
    if (nums[index] == 11) {
      return 1 + array11(nums, index + 1);
    }
    return array11(nums, index + 1);
  }

  /**
   * Given an array of ints, compute recursively if the array contains somewhere a value followed in
   * the array by that value times 10. We'll use the convention of considering only the part of the
   * array that begins at the given index. In this way, a recursive call can pass index+1 to move
   * down the array. The initial call will pass in index as 0.
   *
   * @param nums the array of numbers
   * @param index the starting index
   * @return true, if above mentioned conditions fulfilled
   */
  boolean array220(int[] nums, int index) {
    if (nums.length < 2 || nums.length == index + 1) {
      return false;
    }
    if (nums[index] * 10 == nums[index + 1]) {
      return true;
    }
    return array220(nums, index + 1);
  }

}
