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

}
