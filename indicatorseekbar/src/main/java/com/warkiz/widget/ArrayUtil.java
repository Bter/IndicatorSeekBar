package com.warkiz.widget;

public class ArrayUtil {
    public static long[] reverse(long[] array){
        if(array == null || array.length <= 1)return array;
        long tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static int[] reverse(int[] array){
        if(array == null || array.length <= 1)return array;
        int tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static short[] reverse(short[] array){
        if(array == null || array.length <= 1)return array;
        short tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static boolean[] reverse(boolean[] array){
        if(array == null || array.length <= 1)return array;
        boolean tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static byte[] reverse(byte[] array){
        if(array == null || array.length <= 1)return array;
        byte tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static float[] reverse(float[] array){
        if(array == null || array.length <= 1)return array;
        float tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static double[] reverse(double[] array){
        if(array == null || array.length <= 1)return array;
        double tmp = array[0];
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }

    public static <T> T[] reverse(T[] array){
        if(array == null || array.length <= 1)return array;
        T tmp = null;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        return array;
    }
}
