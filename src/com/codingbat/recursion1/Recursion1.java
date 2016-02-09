package com.codingbat.recursion1;

/**
 * The class Recursion1 is contains solution for Recursion-1 section.
 */
public class Recursion1 {

  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
   * result recursively (without loops).
   *
   * @param n the input number
   * @return the above mentioned new number
   */
  int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
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
   * @param n the fibonacci index
   * @return the above mentioned new number
   */
  int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
