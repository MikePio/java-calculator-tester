package org.java.calculator.test;

import org.java.calculator.tester.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculation;

  // test con numeri interi
  // int num1 = 10;
  // int num2 = 5;

  // test con numeri decimali
  float num1 = 10.10f;
  float num2 = 5.05f;

  // test Divisione con lo 0
  // int num2 = 0;

  // * metodo chiamato prima di ogni test per inizializzare calculation
	@BeforeEach
  public void setUp() {

    try {
      calculation = new Calculator();
    }catch (Exception e){
      e.printStackTrace();
    }
  }

  @Test
  @DisplayName("Test addizione")
  public void testAddition() {

    float result = 0;

    try {
      result = calculation.add(num1, num2);
    }catch (Exception e){
      e.printStackTrace();
    }
    // test con numeri interi // * verifica che il risultato sia uguale a 15
    // assertEquals(15, result);
    // test con numeri decimali // * verifica che il risultato sia uguale a 15.15 con una tolleranza di 0.01f per gestire l'arrotondamento dei float
    assertEquals(15.15f, result, 0.01f); 
  }

  @Test
  @DisplayName("Test sottrazione")
  public void testSubtraction() {

    float result = 0;

    try {
      result = calculation.subtract(num1, num2);
    }catch (Exception e){
      e.printStackTrace();
    }
    // test con numeri interi // * verifica che il risultato sia uguale a 5
    // assertEquals(5, result);
    // test con numeri decimali // * verifica che il risultato sia uguale a 5.05 con una tolleranza di 0.01f per gestire l'arrotondamento dei float
    assertEquals(5.05f, result, 0.01f);
  }

  @Test
  @DisplayName("Test moltiplicazione")
  public void testMultiplication() {

    float result = 0;

    try {
      result = calculation.multiply(num1, num2);
    }catch (Exception e){
      e.printStackTrace();
    }
    // test con numeri interi // * verifica che il risultato sia uguale a 50
    // assertEquals(50, result);
    // test con numeri decimali // * verifica che il risultato sia uguale a 51.005 con una tolleranza di 0.01f per gestire l'arrotondamento dei float
    assertEquals(51.005f, result, 0.01f);
  }

  @Test
  @DisplayName("Test divisione")
  public void testDivision() {

    float result = 0;

    try {
      result = calculation.divide(num1, num2);
    }catch (Exception e){
      e.printStackTrace();
    }
    // test con numeri interi // * verifica che il risultato sia uguale a 2
    // assertEquals(2, result);
    // test con numeri decimali // * verifica che il risultato sia uguale a 2.0 con una tolleranza di 0.01f per gestire l'arrotondamento dei float
    assertEquals(2.0f, result, 0.01f);
  }

  @Test
  @DisplayName("Test divisione per 0")
  public void testDivideByZero() {

    // verifica che la divisione per 0 generi un'eccezione
    assertThrows(Exception.class,
      () -> calculation.divide(num1, 0),
      "Il divisore deve essere diverso da 0");
  }
}