package com.itm.practicas;

import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private Helper Helper;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testConvertFarenheitToCelsius(){
        Helper = new Helper();
        double result = Helper.ConvertFahrenheitToCelsius(24.0);

       assertEquals(-4.44,result,0.1);
    }
}