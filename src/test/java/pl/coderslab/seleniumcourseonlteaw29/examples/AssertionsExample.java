package pl.coderslab.seleniumcourseonlteaw29.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {
    @Test
    public void assertionsExampleTest() {
        Assertions.assertTrue(42==42);
        assertFalse(false);
        assertEquals(4242, 4242);
        assertEquals(3.14, 3.14);
        assertEquals(true, true);
        assertEquals("ala", "ala");
        //itd..
        Object o = new Object();
        assertSame(o, o);
        assertNotEquals(42, 44);
        assertNull(null);
        assertNotNull(new Object());
    }

    @Test
    public void sameVsEqualsExampleTest() {
        Pen p1 = new Pen();
        p1.color = "green";
        Pen p2 = p1;
        assertSame(p1, p2);

        Pen p3 = new Pen();
        p3.color = "green";
        // assertSame(p1, p3); this will fail because references are not equal
        // equals example
        assertEquals(p1, p3);
    }
}

class Pen {
    public String color;

    @Override
    public boolean equals(Object other) {
        // this implementation can be better.
        // please refer to articles about overriding equals() method
        if (!(other instanceof Pen)) {
            return false;
        }
        Pen otherPen = (Pen) other;
        return this.color.equals(otherPen.color);
    }
}
