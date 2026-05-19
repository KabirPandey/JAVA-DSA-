package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,2,5,8,4};

        int[] result = removeDuplicate(arr);

        System.out.println(Arrays.toString(result));
    }

    static int[] removeDuplicate(int[] arr) {

        int n = arr.length;

        int[] temp = new int[n];

        int k = 0;

        for(int i = 0; i < n; i++) {

            boolean isDuplicate = false;

            // check if element already exists in temp
            for(int j = 0; j < k; j++) {

                if(arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // add only unique elements
            if(!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        // return only unique elements
        return Arrays.copyOf(temp, k);
    }
}