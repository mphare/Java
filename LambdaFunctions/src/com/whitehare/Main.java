package com.whitehare;

public class Main {

  private static int value;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        INumericTest isEven = (n) -> (n % 2) ==0;
        INumericTest isNegative = (n) -> (n < 0);

        value = 5;
        System.out.println("Is "+value+" Even? "+isEven.computeTest(value));
        value = 10;
        System.out.println("is "+value+" Even? "+isEven.computeTest( value));
        value = 4;
        System.out.println("Is "+value+" Negative? "+isNegative.computeTest(value));
        value = -34;
        System.out.println("Is "+value+" Negative? "+isNegative.computeTest(value));
    }

}
