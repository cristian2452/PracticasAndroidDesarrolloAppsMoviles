package com.itm.practicas;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private Helper helper;


    @Test
    public void testSortAlgorithm(){
        helper = new Helper();
        int[] result = Helper.BubbleSort(new int[]{3, 2, 1, 4});

        assertArrayEquals(new int[]{1, 2, 3, 4},result);
    }


    @Test
    public void testParseToIntegerArray(){
        helper = new Helper();
        int[] result = Helper.parseLineToIntArray("1,a2, 3,4, asd5");

        assertArrayEquals(new int[]{1,2,3,4,5},result);
    }


    @Test
    public void testSortText(){
        helper = new Helper();
        int[] unsortArray = Helper.parseLineToIntArray("1,a3, 5,4, asd2");
        int[] result = Helper.BubbleSort(unsortArray);

        assertArrayEquals(new int[]{1,2,3,4,5},result);
    }


    @Test
    public void testArrayToStrint(){
        helper = new Helper();
        int[] intArray = {1,2,3,4};
        String result = helper.arayToString(intArray);

        assertEquals("[1, 2, 3, 4]",result);
    }

}