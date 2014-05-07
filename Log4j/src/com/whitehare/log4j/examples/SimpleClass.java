package com.whitehare.log4j.examples;

import org.apache.log4j.Logger;

public class SimpleClass
{
  private static Logger logger = Logger.getLogger(SimpleClass.class);
  int value1;
  int value2;

  public int getValue1()
  {
    logger.debug("Getting Value 1");
    return value1;
  }
  public void setValue1(int value1)
  {
    logger.debug("Setting Value 1");
    this.value1 = value1;
  }
  public int getValue2()
  {
    return value2;
  }
  public void setValue2(int value2)
  {
    this.value2 = value2;
  }

}
