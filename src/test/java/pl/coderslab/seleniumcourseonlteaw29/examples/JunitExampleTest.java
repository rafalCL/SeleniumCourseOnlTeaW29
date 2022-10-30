package pl.coderslab.seleniumcourseonlteaw29.examples;

import org.junit.jupiter.api.*;

public class JunitExampleTest {
    @Test
    public void firstTest() {
        // kod testu
        // given - warunki początkowe
        // when - akcja którą testujemy
        // then - asercje
        System.out.println("test 1");
    }

    @Test
    public void secondTest() {
        // kod testu
        // given - warunki początkowe
        // when - akcja którą testujemy
        // then - asercje
        System.out.println("test 2");
    }

    @Disabled
    @Test
    public void notLikedTest() {
        // kod testu
        // given - warunki początkowe
        // when - akcja którą testujemy
        // then - asercje
        System.out.println("nie chcą żebym się uruchamiał :(");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("this will be executed before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("this will be executed after each test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("this will be executed before ALL tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("this will be executed after ALL tests");
    }
}
