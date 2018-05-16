package com.whitehare;

public class Main {

  private static int value;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        INumericTest isEven = (n) -> (n % 2) ==0;
        INumericTest isNegative = (n) -> (n < 0);
        IComplicatedFunctions multiplyThese = (a, b) -> {
          if (a > 4) {
            return (a * b);
          } else {
            return (a + b);
          }
        };

        value = 5;
        System.out.println("Is "+value+" Even? "+isEven.computeTest(value));
        value = 10;
        System.out.println("is "+value+" Even? "+isEven.computeTest( value));
        value = 4;
        System.out.println("Is "+value+" Negative? "+isNegative.computeTest(value));
        value = -34;
        System.out.println("Is "+value+" Negative? "+isNegative.computeTest(value));
        int a = 3;
        int b = 4;
        System.out.println("The complicated A function results: " + multiplyThese.numericA(a, b));
        a = 5;
        b = 4;
        System.out.println("The complicated A function results: " + multiplyThese.numericA(a, b));
    }

}
