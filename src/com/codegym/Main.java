package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] arr;
    int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập kích thước mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("kích thước mảng ko vượt quá 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("nhập phần tử thứ" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách tài sản: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("tài sản lớn nhất là" + max + " ,tại vị trí " + index);
    }
}
