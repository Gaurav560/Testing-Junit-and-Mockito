package com.gaurav;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void setUp() {

        //this is not a test method and will be static.
        // and be used to prepare resources that are needed to run the test
        System.out.println("This method is called before all the test methods");
    }


    @BeforeEach
    void init() {
        //this is not a test method and will be used to prepare resources that are needed to run the test
        System.out.println("This method is called before each test method");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDownEach() {
        //this is not a test method and will be used to release resources that are needed to run the test
        System.out.println("This method is called after each test method");
    }


    @Test
    @DisplayName("4 divided by 2 should be 2")
    void testIntegerDivision_WhenDividedBy2_ShouldReturnTwo() {

        System.out.println("i am in test 1");
        int result = calculator.integerDivision(4, 2);


        //this assertion message will show only when this unit test fails
        assertEquals(2, result, "4/2 should be 2");
    }


    @Test
    void testIntegerDivision_WhenDividedBy0_ShouldThrowException() {

        try {
            System.out.println("i am in test 2");
            calculator.integerDivision(4, 0);
        } catch (ArithmeticException e) {

            assertEquals("/ by zero", e.getMessage());
        }
    }

    @DisplayName("Integer Subtraction")
    @ParameterizedTest
  //  @MethodSource()
  //  @CsvSource({"4,2,2", "5,3,2", "6,4,2"})
@CsvFileSource(resources = "/integerSubtraction.csv")
    void integerSubtraction(int minuend, int subtrahend, int expectedValue) {

        System.out.println("i am in test 3");
        assertEquals(expectedValue, calculator.integerSubtraction(minuend, subtrahend), minuend - subtrahend + "should be" + expectedValue);
    }


    //used with @MethodSource
//    private static Stream<Arguments> integerSubtraction() {
//        return Stream.of(
//                Arguments.of(4, 2, 2),
//                Arguments.of(5, 3, 2),
//                Arguments.of(6, 4, 2)
//        );
//    }

    @AfterAll
    static void tearDown() {
        //this is not a test method and will be static.
        // and be used to release resources that are needed to run the test
        System.out.println("This method is called after all the test methods");
    }


@ParameterizedTest
@ValueSource(strings = {"Gaurav","Rahul","Rohit"})
    void valueSourceDemonstration(String firstName){
    System.out.println("First Name is : "+firstName);
    assertNotNull(firstName);
    }
}