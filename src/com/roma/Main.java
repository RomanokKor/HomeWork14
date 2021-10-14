package com.roma;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[15];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 40) - 20;
            max = arr[i];
            min = arr[i];

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(Math.max((Math.abs(max)), Math.abs(min)));
    }
}
