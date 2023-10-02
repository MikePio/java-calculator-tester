package org.java.calculator.tester;

public class Main {
  public static void main(String[] args) {
		
    Calculator calculation = new Calculator();

		float num1 = 10.10f;
		float num2 = 5.05f;
		// int num1 = 10;
		// int num2 = 5;
    // test Divisione con lo 0
		// int num2 = 0;

    float sum = calculation.add(num1, num2);
    float difference  = calculation.subtract(num1, num2);
    float product  = calculation.multiply(num1, num2);
    float quotient = 0;

		System.out.println("\nAddizione: "+ num1 + " + " + num2 + " = " + String.format("%.2f", sum));
		System.out.println("\nSottrazione: "+ num1 + " - " + num2 + " = " + String.format("%.2f", difference));
		System.out.println("\nMoltiplicazione: "+ num1 + " * " + num2 + " = " + String.format("%.2f", product));

		try {

      quotient  = calculation.divide(num1, num2);
      System.out.println("\nDivisione: "+ num1 + " / " + num2 + " = " + String.format("%.2f", quotient));
		}catch(Exception e) {

			System.out.println("\nErrore" + e.getMessage());
		}

    System.out.println("\n");

	}

}