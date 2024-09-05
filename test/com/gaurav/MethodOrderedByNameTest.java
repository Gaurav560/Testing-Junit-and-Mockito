package com.gaurav;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest {

    @Test
    void TestA() {
        System.out.println("running Test A");
    }
    @Test
    void TestC() {
        System.out.println("running Test C");
    }

    @Test
    void TestD() {
        System.out.println("running Test D");
    }

    @Test
    void TestB() {
        System.out.println("running Test B");
    }


}
