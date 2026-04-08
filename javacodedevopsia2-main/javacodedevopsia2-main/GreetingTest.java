package org.bnmit.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {

    Greeting g = new Greeting();

    @Test
    void testGreeting() {
        assertEquals("Hello BNMIT", g.greet("BNMIT"));
    }
}
