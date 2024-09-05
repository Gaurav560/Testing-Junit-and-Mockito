package com.gaurav;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoRepeatedTest {

    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

@DisplayName("4 divided by 2 should be 2")
    @RepeatedTest(value = 5, name = "{displayName} .Repetition {currentRepetition} of {totalRepetitions}")
    void testIntegerDivision_WhenDividedBy0_ShouldThrowException(RepetitionInfo repetitionInfo, TestInfo testInfo) {

        try {
            System.out.println("i am in test 2");
            System.out.println("Current repetition: " + repetitionInfo.getCurrentRepetition());
            System.out.println("Total repetitions: " + repetitionInfo.getTotalRepetitions());
            System.out.println(testInfo.getTestMethod().get().getName());
            calculator.integerDivision(4, 0);
        } catch (ArithmeticException e) {

            assertEquals("/ by zero", e.getMessage());
        }
    }

}
