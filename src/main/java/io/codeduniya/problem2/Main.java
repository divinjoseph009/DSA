package io.codeduniya.problem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'R', 'G', 'R', 'B', 'G', 'B'};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void partition(char[] arr) {
        int l = 0, h = arr.length-1, m = 0;
        while(m <= h) {
            if(arr[m] == 'R') {
                swap(arr, l, m);
                l++; m++;
            } else if (arr[m] == 'G') {
                m++;
            } else { //arr[m] == 'B'
                swap(arr, m, h);
                h--;
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
