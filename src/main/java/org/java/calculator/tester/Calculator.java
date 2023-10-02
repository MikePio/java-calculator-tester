package org.java.calculator.tester;

public class Calculator {

  // addizione
  public float add(float num1, float num2) {

    return num1 + num2;
  }
  
  // sottrazione
  public float subtract(float num1, float num2) {

    return num1 - num2;
  }

  // moltiplicazione
  public float multiply(float num1, float num2) {

    return num1 * num2;
  }

  // divisione
  public float divide(float num1, float num2) throws Exception {

    if (num2 == 0) {
      throw new Exception("Il divisore deve essere diverso da 0");
    }
    return num1 / num2;
  }

}