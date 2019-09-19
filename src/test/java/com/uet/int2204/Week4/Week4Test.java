package com.uet.int2204.Week4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(Math.max(12, 14), 14);
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(Math.max(-12, 1), 1);
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(Math.max(0, 0), 0);
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(Math.max(-1, -123456788), -1);
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(Math.max(12, -12), 12);
    }

    @Test
    public void testMinArray1() {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        int minValue = (int) 1e9;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
            minValue = Math.min(minValue, arr[i]);
        }
        Assert.assertEquals(Week4.minArray(arr), minValue);
    }

    @Test
    public void testMinArray2() {
        int length = 34;
        int[] arr = new int[length];
        Random random = new Random();
        int minValue = (int) 1e9;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
            minValue = Math.min(minValue, arr[i]);
        }
        Assert.assertEquals(Week4.minArray(arr), minValue);
    }

    @Test
    public void testMinArray3() {
        int length = 55;
        int[] arr = new int[length];
        Random random = new Random();
        int minValue = (int) 1e9;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
            minValue = Math.min(minValue, arr[i]);
        }
        Assert.assertEquals(Week4.minArray(arr), minValue);
    }

    @Test
    public void testMinArray4() {
        int length = 80;
        int[] arr = new int[length];
        Random random = new Random();
        int minValue = (int) 1e9;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
            minValue = Math.min(minValue, arr[i]);
        }
        Assert.assertEquals(Week4.minArray(arr), minValue);
    }

    @Test
    public void testMinArray5() {
        int length = 100;
        int[] arr = new int[length];
        Random random = new Random();
        int minValue = (int) 1e9;
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt();
            minValue = Math.min(minValue, arr[i]);
        }
        Assert.assertEquals(Week4.minArray(arr), minValue);
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals(Week4.calculateBMI(65.0, 1.8), "Bình thường");
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals(Week4.calculateBMI(99.9, 1.8), "Béo phì");
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals(Week4.calculateBMI(5.8, 1.8), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals(Week4.calculateBMI(55.3, 1.51), "Thừa cân");
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals(Week4.calculateBMI(1000.5, 1.0), "Béo phì");
    }
}
