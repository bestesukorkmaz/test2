package org.example;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * @author Semih Saydam
 * @version 0.0.1
 */
public class AppTest {
    App app = new App();
    int number1 = 3;
    int number2 = 5;

    @Test
    public void AddTest() {
        int addResult = app.Add(number1, number2);
        assertEquals("This is not equal!",
                        8, addResult);
    }

    @Test
    public void SubtractTest() throws Exception {
        int SubResult = app.Subtract(number2,number1);
        assertEquals(2,SubResult);
    }

    @Test
    public void MultiplyTest() throws Exception {
        int MultipResult = app.Multiply(number2,number1);
        assertEquals(15,MultipResult);
    }

    @Test
    public void mainTest() {
        App app = new App();
        app.main(new String[]{"arg1", "arg2"});
    }
}
