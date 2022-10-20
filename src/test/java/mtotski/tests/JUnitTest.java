package mtotski.tests;

import org.junit.jupiter.api.*;


public class JUnitTest {


    @BeforeAll
    static void setUp() {
        System.out.println("### @BeforeAll !");
    }

    @AfterAll
    static void tearDown() {
        System.out.println(("### @AFterALL !"));
    }

    @BeforeEach
    void beforeEachTest() { //open("ya.ru")

    }

    @Test
    void webpageTest() {
        System.out.println("###   @Test SimpleTestFirst() !");
        Assertions.assertTrue(3 > 2);
    }
}
