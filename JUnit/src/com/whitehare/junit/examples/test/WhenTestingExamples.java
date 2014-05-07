package com.whitehare.junit.examples.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.whitehare.junit.examples.JUnitExamples;

public class WhenTestingExamples {

	@Test
	public void testValue1() {
		int inVal1 = 5;
		int outVal1;
		JUnitExamples jue1 = new JUnitExamples();
		jue1.setValue1(inVal1);
		outVal1 = jue1.getValue1();
		assertEquals(inVal1, outVal1);
	}

	@Test
  public void testValue2() {
    int inVal2 = 10;
    int outVal2;
    JUnitExamples jue1 = new JUnitExamples();
    jue1.setValue1(inVal2);
    outVal2 = jue1.getValue1();
    assertEquals(inVal2, outVal2);
  }

}
