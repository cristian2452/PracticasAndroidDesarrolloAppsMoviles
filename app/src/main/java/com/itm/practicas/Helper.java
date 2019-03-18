package com.itm.practicas;

import java.util.Arrays;

public class Helper {

    public static int[] BubbleSort(int[] unsortedArray) {
        int[] sortedArray = unsortedArray;

        for(int i=sortedArray.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(sortedArray[j]>sortedArray[j+1]) {
                    int temp = sortedArray[j];

                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        return sortedArray;
    }


    private static int[] toIntArray(String[] unparseArray) {
        int[] ints = new int[unparseArray.length];
        for (int i = 0; i < unparseArray.length; i++) {
            ints[i] = Integer.parseInt(unparseArray[i]);
        }
        return ints;
    }


    public static int[] parseLineToIntArray(String text) {
        try {
            return toIntArray(text.replaceAll("[^0-9,-]", "").split(","));
        }catch (Exception e){
            return new int[]{0};
        }
    }


    public static String arayToString(int[] intArray)
    {
        String stringArray[] = new String[intArray.length];

        for (int i = 0; i < intArray.length; i++)
            stringArray[i] = String.valueOf(intArray[i]);

        return Arrays.toString(stringArray);
    }


}