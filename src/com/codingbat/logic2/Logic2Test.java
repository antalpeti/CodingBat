package com.codingbat.logic2;

import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * The class Logic2Test is contains tests for Logic-2 section.
 */
public class Logic2Test {

  /** The instance variable to test the not static methods. */
  private static Logic2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Logic2();
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

}
