package com.uet.int2204.Week4;

public class Week4 {

    /**
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++)
            minValue = Math.min(minValue, arr[i]);
        return minValue;
    }

    /**
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        if (bmi + 1e-8 < 18.5)
            return "Thiếu cân";
        if (Double.compare(bmi, 22.9) <= 0)
            return "Bình thường";
        if (Double.compare(bmi, 24.9) <= 0)
            return "Thừa cân";
        return "Béo phì";
    }
}