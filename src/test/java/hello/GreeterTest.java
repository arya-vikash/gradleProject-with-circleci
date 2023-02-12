package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    public void shouldPrintHelloWorld(){
        Greeter greeter = new Greeter();
        assertEquals(greeter.getName(),"Hello World");
    }

}