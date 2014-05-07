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

}
