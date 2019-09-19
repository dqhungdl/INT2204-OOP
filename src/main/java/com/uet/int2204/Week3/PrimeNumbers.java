package com.uet.int2204.Week3;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++)
            if (!isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i; j <= n; j += i)
                    isPrime[j] = true;
            }
    }
}