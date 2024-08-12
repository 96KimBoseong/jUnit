package com.junit;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {
    @BeforeEach
    void setUp() {
        System.out.println("테스트 실행되기전 셋업");
    }

    @AfterEach
    void tearDown() {
        System.out.println("테스트 가 실행된 후 수행\n");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기전 최초수행\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트코드가 수행된 후 마지막 수행");
    }

    @Test
    void test1(){
        System.out.println("test 01");
    }
    @Test
    void test2(){
        System.out.println("test 02");
    }
}
