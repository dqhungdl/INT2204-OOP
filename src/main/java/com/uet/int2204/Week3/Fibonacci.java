package com.uet.int2204.Week3;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[] f = new BigInteger[n + 1];
        if(n>=0)
            f[0] = new BigInteger("0");
        if(n>=1)
            f[1] = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 1].add(f[i - 2]);
        System.out.println(f[n]);
    }
}
