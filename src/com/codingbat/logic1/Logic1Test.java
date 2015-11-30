package com.codingbat.logic1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Logic1Test is contains tests for Logic-1 section.
 */
public class Logic1Test {

  /** The instance variable to test the not static methods. */
  private static Logic1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Logic1();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Logic1#cigarParty(int, boolean)}.
   */
  @Test
  public void testCigarParty() {
    for (int i = 0; i < 40; i++) {
      Assert.assertEquals(false, instance.cigarParty(i, false));
      Assert.assertEquals(false, instance.cigarParty(i, true));
    }
    for (int i = 40; i < 61; i++) {
      Assert.assertEquals(true, instance.cigarParty(i, false));
      Assert.assertEquals(true, instance.cigarParty(i, true));
    }
    for (int i = 61; i < 100; i++) {
      Assert.assertEquals(false, instance.cigarParty(i, false));
      Assert.assertEquals(true, instance.cigarParty(i, true));
    }
  }

  /**
   * Test method for {@link Logic1#dateFashion(int, int)}.
   */
  @Test
  public void testDateFashion() {
    for (int i = 0; i < 11; i++) {
      Assert.assertEquals(0, instance.dateFashion(0, i));
      Assert.assertEquals(0, instance.dateFashion(1, i));
      Assert.assertEquals(0, instance.dateFashion(2, i));
      Assert.assertEquals(0, instance.dateFashion(i, 0));
      Assert.assertEquals(0, instance.dateFashion(i, 1));
      Assert.assertEquals(0, instance.dateFashion(i, 2));
    }
    for (int i = 3; i < 11; i++) {
      Assert.assertEquals(2, instance.dateFashion(8, i));
      Assert.assertEquals(2, instance.dateFashion(9, i));
      Assert.assertEquals(2, instance.dateFashion(10, i));
      Assert.assertEquals(2, instance.dateFashion(i, 8));
      Assert.assertEquals(2, instance.dateFashion(i, 9));
      Assert.assertEquals(2, instance.dateFashion(i, 10));

    }
    for (int i = 3; i < 7; i++) {
      for (int j = 3; j < 7; j++) {
        Assert.assertEquals(1, instance.dateFashion(i, j));
      }
    }
  }

  /**
   * Test method for {@link Logic1#squirrelPlay(int, boolean)}.
   */
  @Test
  public void testSquirrelPlay() {
    Assert.assertEquals(false, instance.squirrelPlay(50, false));
    Assert.assertEquals(false, instance.squirrelPlay(50, true));
    Assert.assertEquals(false, instance.squirrelPlay(59, false));
    Assert.assertEquals(false, instance.squirrelPlay(59, true));
    Assert.assertEquals(true, instance.squirrelPlay(60, false));
    Assert.assertEquals(true, instance.squirrelPlay(60, true));
    Assert.assertEquals(true, instance.squirrelPlay(70, false));
    Assert.assertEquals(true, instance.squirrelPlay(70, true));
    Assert.assertEquals(true, instance.squirrelPlay(90, false));
    Assert.assertEquals(true, instance.squirrelPlay(90, true));
    Assert.assertEquals(false, instance.squirrelPlay(95, false));
    Assert.assertEquals(true, instance.squirrelPlay(95, true));
    Assert.assertEquals(false, instance.squirrelPlay(100, false));
    Assert.assertEquals(true, instance.squirrelPlay(100, true));
    Assert.assertEquals(false, instance.squirrelPlay(101, false));
    Assert.assertEquals(false, instance.squirrelPlay(101, true));
  }

  /**
   * Test method for {@link Logic1#caughtSpeeding(int, boolean)}.
   */
  @Test
  public void testCaughtSpeeding() {
    Assert.assertEquals(0, instance.caughtSpeeding(40, false));
    Assert.assertEquals(0, instance.caughtSpeeding(40, true));
    Assert.assertEquals(0, instance.caughtSpeeding(60, false));
    Assert.assertEquals(0, instance.caughtSpeeding(60, true));
    Assert.assertEquals(1, instance.caughtSpeeding(61, false));
    Assert.assertEquals(0, instance.caughtSpeeding(61, true));
    Assert.assertEquals(1, instance.caughtSpeeding(65, false));
    Assert.assertEquals(0, instance.caughtSpeeding(65, true));
    Assert.assertEquals(1, instance.caughtSpeeding(66, false));
    Assert.assertEquals(1, instance.caughtSpeeding(66, true));
    Assert.assertEquals(1, instance.caughtSpeeding(75, false));
    Assert.assertEquals(1, instance.caughtSpeeding(75, true));
    Assert.assertEquals(1, instance.caughtSpeeding(80, false));
    Assert.assertEquals(1, instance.caughtSpeeding(80, true));
    Assert.assertEquals(2, instance.caughtSpeeding(85, false));
    Assert.assertEquals(1, instance.caughtSpeeding(85, true));
    Assert.assertEquals(2, instance.caughtSpeeding(86, false));
    Assert.assertEquals(2, instance.caughtSpeeding(86, true));
    Assert.assertEquals(2, instance.caughtSpeeding(90, false));
    Assert.assertEquals(2, instance.caughtSpeeding(90, true));
  }

  /**
   * Test method for {@link Logic1#sortaSum(int, int)}.
   */
  @Test
  public void testSortaSum() {
    Assert.assertEquals(7, instance.sortaSum(3, 4));
    Assert.assertEquals(20, instance.sortaSum(9, 4));
    Assert.assertEquals(21, instance.sortaSum(10, 11));
    Assert.assertEquals(9, instance.sortaSum(12, -3));
    Assert.assertEquals(9, instance.sortaSum(-3, 12));
    Assert.assertEquals(9, instance.sortaSum(4, 5));
    Assert.assertEquals(20, instance.sortaSum(4, 6));
    Assert.assertEquals(21, instance.sortaSum(14, 7));
    Assert.assertEquals(20, instance.sortaSum(14, 6));
    Assert.assertEquals(20, instance.sortaSum(8, 8));
  }

  /**
   * Test method for {@link Logic1#alarmClock(int, boolean)}.
   */
  @Test
  public void testAlarmClock() {
    for (int index = 1; index < 6; index++) {
      Assert.assertEquals("7:00", instance.alarmClock(index, false));
      Assert.assertEquals("10:00", instance.alarmClock(index, true));
    }
    Assert.assertEquals("10:00", instance.alarmClock(0, false));
    Assert.assertEquals("off", instance.alarmClock(0, true));
    Assert.assertEquals("10:00", instance.alarmClock(6, false));
    Assert.assertEquals("off", instance.alarmClock(6, true));
  }

  /**
   * Test method for {@link Logic1#love6(int, int)}.
   */
  @Test
  public void testLove6() {
    Assert.assertEquals(true, instance.love6(6, 4));
    Assert.assertEquals(false, instance.love6(4, 5));
    Assert.assertEquals(true, instance.love6(1, 5));
    Assert.assertEquals(true, instance.love6(1, 6));
    Assert.assertEquals(false, instance.love6(1, 8));
    Assert.assertEquals(true, instance.love6(1, 7));
    Assert.assertEquals(false, instance.love6(7, 5));
    Assert.assertEquals(true, instance.love6(8, 2));
    Assert.assertEquals(true, instance.love6(6, 6));
    Assert.assertEquals(false, instance.love6(-6, 2));
    Assert.assertEquals(true, instance.love6(-4, -10));
    Assert.assertEquals(false, instance.love6(-7, 1));
    Assert.assertEquals(true, instance.love6(-7, -1));
    Assert.assertEquals(true, instance.love6(-6, 12));
    Assert.assertEquals(false, instance.love6(-2, -4));
    Assert.assertEquals(true, instance.love6(1, 7));
    Assert.assertEquals(false, instance.love6(0, 9));
    Assert.assertEquals(false, instance.love6(8, 3));
    Assert.assertEquals(true, instance.love6(3, 3));
    Assert.assertEquals(false, instance.love6(3, 4));
  }

  /**
   * Test method for {@link Logic1#in1To10(int, boolean)}.
   */
  @Test
  public void testIn1To10() {
    Assert.assertEquals(true, instance.in1To10(5, false));
    Assert.assertEquals(false, instance.in1To10(5, true));
    Assert.assertEquals(false, instance.in1To10(11, false));
    Assert.assertEquals(true, instance.in1To10(11, true));
    Assert.assertEquals(true, instance.in1To10(10, true));
    Assert.assertEquals(true, instance.in1To10(10, false));
    Assert.assertEquals(true, instance.in1To10(9, false));
    Assert.assertEquals(false, instance.in1To10(9, true));
    Assert.assertEquals(true, instance.in1To10(1, false));
    Assert.assertEquals(true, instance.in1To10(1, true));
    Assert.assertEquals(false, instance.in1To10(0, false));
    Assert.assertEquals(true, instance.in1To10(0, true));
    Assert.assertEquals(false, instance.in1To10(-1, false));
    Assert.assertEquals(true, instance.in1To10(-1, true));
  }

  /**
   * Test method for {@link Logic1#specialEleven(int)}.
   */
  @Test
  public void testSpecialEleven() {
    Assert.assertEquals(true, instance.specialEleven(22));
    Assert.assertEquals(true, instance.specialEleven(23));
    Assert.assertEquals(false, instance.specialEleven(21));
    Assert.assertEquals(false, instance.specialEleven(24));
    Assert.assertEquals(true, instance.specialEleven(11));
    Assert.assertEquals(true, instance.specialEleven(12));
    Assert.assertEquals(false, instance.specialEleven(10));
    Assert.assertEquals(false, instance.specialEleven(9));
    Assert.assertEquals(false, instance.specialEleven(8));
    Assert.assertEquals(false, instance.specialEleven(7));
    Assert.assertEquals(false, instance.specialEleven(6));
    Assert.assertEquals(false, instance.specialEleven(5));
    Assert.assertEquals(false, instance.specialEleven(4));
    Assert.assertEquals(false, instance.specialEleven(3));
    Assert.assertEquals(false, instance.specialEleven(2));
    Assert.assertEquals(true, instance.specialEleven(1));
    Assert.assertEquals(true, instance.specialEleven(0));
    Assert.assertEquals(true, instance.specialEleven(121));
    Assert.assertEquals(true, instance.specialEleven(122));
    Assert.assertEquals(false, instance.specialEleven(123));
    Assert.assertEquals(false, instance.specialEleven(46));
    Assert.assertEquals(false, instance.specialEleven(49));
    Assert.assertEquals(false, instance.specialEleven(52));
    Assert.assertEquals(false, instance.specialEleven(54));
    Assert.assertEquals(true, instance.specialEleven(55));
  }

  /**
   * Test method for {@link Logic1#more20(int)}.
   */
  @Test
  public void testMore20() {
    for (int i = 0; i < 2015; i += 20) {
      Assert.assertEquals(false, instance.more20(i));
      Assert.assertEquals(true, instance.more20(i + 1));
      Assert.assertEquals(true, instance.more20(i + 2));
      Assert.assertEquals(false, instance.more20(i + 3));
      Assert.assertEquals(false, instance.more20(i + 4));
      Assert.assertEquals(false, instance.more20(i + 5));
      Assert.assertEquals(false, instance.more20(i + 6));
      Assert.assertEquals(false, instance.more20(i + 7));
      Assert.assertEquals(false, instance.more20(i + 8));
      Assert.assertEquals(false, instance.more20(i + 9));
      Assert.assertEquals(false, instance.more20(i + 10));
      Assert.assertEquals(false, instance.more20(i + 11));
      Assert.assertEquals(false, instance.more20(i + 12));
      Assert.assertEquals(false, instance.more20(i + 13));
      Assert.assertEquals(false, instance.more20(i + 14));
      Assert.assertEquals(false, instance.more20(i + 15));
      Assert.assertEquals(false, instance.more20(i + 16));
      Assert.assertEquals(false, instance.more20(i + 17));
      Assert.assertEquals(false, instance.more20(i + 18));
      Assert.assertEquals(false, instance.more20(i + 19));
    }
  }

  /**
   * Test method for {@link Logic1#odd35(int)}.
   */
  @Test
  public void testOdd35() {
    Assert.assertEquals(true, instance.odd35(3));
    Assert.assertEquals(true, instance.odd35(10));
    Assert.assertEquals(false, instance.odd35(15));
    Assert.assertEquals(true, instance.odd35(5));
    Assert.assertEquals(true, instance.odd35(9));
    Assert.assertEquals(false, instance.odd35(8));
    Assert.assertEquals(false, instance.odd35(7));
    Assert.assertEquals(true, instance.odd35(6));
    Assert.assertEquals(false, instance.odd35(17));
    Assert.assertEquals(true, instance.odd35(18));
    Assert.assertEquals(true, instance.odd35(20));
    Assert.assertEquals(false, instance.odd35(29));
    Assert.assertEquals(true, instance.odd35(21));
    Assert.assertEquals(false, instance.odd35(22));
    Assert.assertEquals(false, instance.odd35(45));
    Assert.assertEquals(true, instance.odd35(99));
  }

  /**
   * Test method for {@link Logic1#less20(int)}.
   */
  @Test
  public void testLess20() {
    int i = -1;
    while (i < 2015) {
      Assert.assertEquals(false, instance.less20(++i)); // 0
      Assert.assertEquals(false, instance.less20(++i)); // 1
      Assert.assertEquals(false, instance.less20(++i)); // 2
      Assert.assertEquals(false, instance.less20(++i)); // 3
      Assert.assertEquals(false, instance.less20(++i)); // 4
      Assert.assertEquals(false, instance.less20(++i)); // 5
      Assert.assertEquals(false, instance.less20(++i)); // 6
      Assert.assertEquals(false, instance.less20(++i)); // 7
      Assert.assertEquals(false, instance.less20(++i)); // 8
      Assert.assertEquals(false, instance.less20(++i)); // 9
      Assert.assertEquals(false, instance.less20(++i)); // 10
      Assert.assertEquals(false, instance.less20(++i)); // 11
      Assert.assertEquals(false, instance.less20(++i)); // 12
      Assert.assertEquals(false, instance.less20(++i)); // 13
      Assert.assertEquals(false, instance.less20(++i)); // 14
      Assert.assertEquals(false, instance.less20(++i)); // 15
      Assert.assertEquals(false, instance.less20(++i)); // 16
      Assert.assertEquals(false, instance.less20(++i)); // 17
      Assert.assertEquals(true, instance.less20(++i)); // 18
      Assert.assertEquals(true, instance.less20(++i)); // 19
    }
  }

  /**
   * Test method for {@link Logic1#nearTen(int)}.
   */
  @Test
  public void testNearTen() {
    for (int i = 0; i < 2015; i += 10) {
      Assert.assertEquals(true, instance.nearTen(i));
      Assert.assertEquals(true, instance.nearTen(i + 1));
      Assert.assertEquals(true, instance.nearTen(i + 2));
      Assert.assertEquals(false, instance.nearTen(i + 3));
      Assert.assertEquals(false, instance.nearTen(i + 4));
      Assert.assertEquals(false, instance.nearTen(i + 5));
      Assert.assertEquals(false, instance.nearTen(i + 6));
      Assert.assertEquals(false, instance.nearTen(i + 7));
      Assert.assertEquals(true, instance.nearTen(i + 8));
      Assert.assertEquals(true, instance.nearTen(i + 9));
    }
  }

  /**
   * Test method for {@link Logic1#teenSum(int, int)}.
   */
  @Test
  public void testTeenSum() {
    // full scale check
    int leftOutside = 0;
    int leftNearBound = 12;
    int leftBound = 13;
    int rightBound = 19;
    int rightNearBound = 20;
    int rightOutside = 120;

    for (int a = leftOutside; a <= leftNearBound; a++) {
      for (int b = leftOutside; b <= leftNearBound; b++) {
        Assert.assertEquals(a + b, instance.teenSum(a, b));
      }
    }
    for (int a = leftOutside; a <= leftNearBound; a++) {
      for (int b = leftBound; b <= rightBound; b++) {
        Assert.assertEquals(rightBound, instance.teenSum(a, b));
      }
    }
    for (int a = leftOutside; a <= leftNearBound; a++) {
      for (int b = rightNearBound; b <= rightOutside; b++) {
        Assert.assertEquals(a + b, instance.teenSum(a, b));
      }
    }
    for (int a = leftBound; a <= rightBound; a++) {
      for (int b = leftOutside; b <= leftNearBound; b++) {
        Assert.assertEquals(rightBound, instance.teenSum(a, b));
      }
    }
    for (int a = leftBound; a <= rightBound; a++) {
      for (int b = leftBound; b <= rightBound; b++) {
        Assert.assertEquals(rightBound, instance.teenSum(a, b));
      }
    }
    for (int a = leftBound; a <= rightBound; a++) {
      for (int b = rightNearBound; b <= rightOutside; b++) {
        Assert.assertEquals(rightBound, instance.teenSum(a, b));
      }
    }
    for (int a = rightNearBound; a <= rightOutside; a++) {
      for (int b = leftOutside; b <= leftNearBound; b++) {
        Assert.assertEquals(a + b, instance.teenSum(a, b));
      }
    }
    for (int a = rightNearBound; a <= rightOutside; a++) {
      for (int b = leftBound; b <= rightBound; b++) {
        Assert.assertEquals(rightBound, instance.teenSum(a, b));
      }
    }
    for (int a = rightNearBound; a <= rightOutside; a++) {
      for (int b = rightNearBound; b <= rightOutside; b++) {
        Assert.assertEquals(a + b, instance.teenSum(a, b));
      }
    }
  }

  /**
   * Test method for {@link Logic1#answerCell(boolean, boolean, boolean)}.
   */
  @Test
  public void testAnswerCell() {
    Assert.assertEquals(true, instance.answerCell(false, false, false));
    Assert.assertEquals(false, instance.answerCell(false, false, true));
    Assert.assertEquals(true, instance.answerCell(false, true, false));
    Assert.assertEquals(false, instance.answerCell(false, true, true));
    Assert.assertEquals(false, instance.answerCell(true, false, false));
    Assert.assertEquals(false, instance.answerCell(true, false, true));
    Assert.assertEquals(true, instance.answerCell(true, true, false));
    Assert.assertEquals(false, instance.answerCell(true, true, true));
  }

  /**
   * Test method for {@link Logic1#teaParty(int, int)}.
   */
  @Test
  public void testTeaParty() {
    Assert.assertEquals(0, instance.teaParty(3, 8));
    Assert.assertEquals(0, instance.teaParty(10, 4));
    Assert.assertEquals(0, instance.teaParty(11, 4));
    Assert.assertEquals(0, instance.teaParty(4, 5));
    Assert.assertEquals(1, instance.teaParty(5, 5));
    Assert.assertEquals(1, instance.teaParty(6, 8));
    Assert.assertEquals(1, instance.teaParty(5, 9));
    Assert.assertEquals(1, instance.teaParty(6, 6));
    Assert.assertEquals(1, instance.teaParty(11, 6));
    Assert.assertEquals(2, instance.teaParty(12, 6));
    Assert.assertEquals(2, instance.teaParty(20, 6));
    Assert.assertEquals(2, instance.teaParty(5, 10));
    Assert.assertEquals(2, instance.teaParty(10, 20));
  }

  /**
   * Test method for {@link Logic1#fizzString(String)}.
   */
  @Test
  public void testFizzString() {
    Assert.assertEquals("Fizz", instance.fizzString("fig"));
    Assert.assertEquals("Buzz", instance.fizzString("dib"));
    Assert.assertEquals("FizzBuzz", instance.fizzString("fib"));
    Assert.assertEquals("abc", instance.fizzString("abc"));
    Assert.assertEquals("Fizz", instance.fizzString("fooo"));
    Assert.assertEquals("booo", instance.fizzString("booo"));
    Assert.assertEquals("Buzz", instance.fizzString("ooob"));
    Assert.assertEquals("FizzBuzz", instance.fizzString("fooob"));
    Assert.assertEquals("Fizz", instance.fizzString("f"));
    Assert.assertEquals("Buzz", instance.fizzString("b"));
    Assert.assertEquals("Buzz", instance.fizzString("abcb"));
    Assert.assertEquals("Hello", instance.fizzString("Hello"));
    Assert.assertEquals("Buzz", instance.fizzString("Hellob"));
    Assert.assertEquals("af", instance.fizzString("af"));
    Assert.assertEquals("bf", instance.fizzString("bf"));
    Assert.assertEquals("FizzBuzz", instance.fizzString("fb"));
  }
}
