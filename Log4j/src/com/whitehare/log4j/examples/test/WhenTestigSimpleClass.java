package com.whitehare.log4j.examples.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.whitehare.log4j.examples.Log4jExamples;
import com.whitehare.log4j.examples.SimpleClass;

public class WhenTestigSimpleClass
{
  private static Logger logger = Logger.getLogger(WhenTestigSimpleClass.class);
  
  @Test
  public void test()
  {
    logger.debug("Riunning Log4j Test");
    SimpleClass obj1 = new SimpleClass();
    int inputValue = 5;
    
    obj1.setValue1(inputValue);
    
    int value = obj1.getValue1();
    
    assertEquals(inputValue, value);
  }

}
