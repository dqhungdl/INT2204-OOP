package com.uet.int2204.Week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8_Task2 {

    // Null pointer
    public void NPEx() {
        String str = null;
        str.charAt(0);
    }

    public String NPExTest() {
        try {
            NPEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    // Out of bound
    public void AIOoBEx() {
        int[] array = new int[5];
        array[5] = 5;
    }

    public String AIOoBExTest() {
        try {
            AIOoBEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    // Arithmetic
    public void ArithEx() {
        int rs = 1 / 0;
    }

    public String ArithExTest() {
        try {
            ArithEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    // File not found
    public void FNFEx() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("InvalidFile"));
        scanner.next();
    }

    public String FNFExTest() {
        try {
            FNFEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    // Input/output
    public void IOEx() throws IOException {
        Scanner scanner = new Scanner(new File("InvalidFile"));
        scanner.next();
    }

    public String IOExTest() {
        try {
            IOEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    public static void main(String[] args) {
        Week8_Task2 exception = new Week8_Task2();
        System.out.println(exception.NPExTest());
        System.out.println(exception.AIOoBExTest());
        System.out.println(exception.ArithExTest());
        System.out.println(exception.FNFExTest());
        System.out.println(exception.IOExTest());
    }
}
