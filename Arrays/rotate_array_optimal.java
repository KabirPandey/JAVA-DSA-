package Arrays;

import java.util.Arrays;

public class rotate_array_optimal {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int k = 3;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        // reverse first k elements
        reverse(arr, 0, k - 1);

        // reverse remaining elements
        reverse(arr, k, n - 1);

        // reverse whole array
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
} 
