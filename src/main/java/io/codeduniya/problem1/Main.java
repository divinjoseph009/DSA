package io.codeduniya.problem1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 11, 8};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void partition(int[] arr) {
        int l = 0, h = arr.length-1;
        while(l <= h) {
            if(arr[l]%2 == 1) {
                l++;
            } else if (arr[h]%2 == 0) {
                h--;
            } else {
                swap(arr, l, h);
            }

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}