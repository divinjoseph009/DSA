package io.codeduniya.problem1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 11, 8};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void partition(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i < j) {
            do {
                i++;
            } while (arr[i] % 2 != 0);

            do {
                j--;
            } while (arr[j] % 2 == 0);
            if (i >= j) return;
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}