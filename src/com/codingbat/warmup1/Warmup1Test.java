package com.codingbat.warmup1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Warmup1Test {

  private Warmup1 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Warmup1();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Warmup1#sleepIn(boolean, boolean)}.
   */
  @Test
  public void testSleepIn() {
    Assert.assertEquals(true, instance.sleepIn(false, false));
    Assert.assertEquals(false, instance.sleepIn(true, false));
    Assert.assertEquals(true, instance.sleepIn(false, true));
    Assert.assertEquals(true, instance.sleepIn(true, true));
  }

}
