package com.gaurav;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderRandomlyTest {

    @Test
    void TestA() {
        System.out.println("running Test A");
    }

    @Test
    void TestB() {
        System.out.println("running Test B");
    }

    @Test
    void TestC() {
        System.out.println("running Test C");
    }

    @Test
    void TestD() {
        System.out.println("running Test D");
    }
}
