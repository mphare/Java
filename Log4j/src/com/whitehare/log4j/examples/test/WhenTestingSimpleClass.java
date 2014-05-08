package com.whitehare.log4j.examples.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.whitehare.log4j.examples.Log4jExamples;
import com.whitehare.log4j.examples.SimpleClass;

public class WhenTestingSimpleClass
{
  private static Logger logger = Logger.getLogger(WhenTestingSimpleClass.class);
  
  @Test
  public void shouldLogExecution()
  {
    logger.debug("Running Log4j Test");
    SimpleClass obj1 = new SimpleClass();
    int inputValue = 5;
    
    obj1.setValue1(inputValue);
    
    int value = obj1.getValue1();
    
    assertEquals(inputValue, value);
  }

}
