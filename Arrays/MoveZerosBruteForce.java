package Arrays;

import java.util.Arrays;

public class MoveZerosBruteForce {

    public static void moveZeros(int[] arr) {

        int n = arr.length;

        // temporary array
        int[] temp = new int[n];

        int j = 0;

        // store non-zero elements
        for(int i = 0; i < n; i++) {

            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        // copy temp back to original array
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,0,1};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
