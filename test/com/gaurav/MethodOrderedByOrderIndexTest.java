package com.gaurav;

import org.junit.jupiter.api.*;

//we can control the execution of tests in this class by using the @Order annotation

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {

    StringBuilder str = new StringBuilder();

    @AfterEach
    void afterEach() {
        System.out.println("the state of instance object is:"+str);
    }

    @Test
    @Order(1)
    void TestA() {
        System.out.println("running Test A");
        str.append("A");
    }

    @Test
    @Order(4)
    void TestB() {
        System.out.println("running Test B");
        str.append("B");
    }

    @Test
    @Order(2)
    void TestC() {
        System.out.println("running Test C");
        str.append("C");
    }

    @Test
    @Order(3)
    void TestD() {
        System.out.println("running Test D");
        str.append("D");
    }
}
