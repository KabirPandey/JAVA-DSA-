package Arrays;

import java.util.Arrays;

public class MoveZerosOptimal {

    public static void moveZeros(int[] arr) {

        int n = arr.length;

        int j = -1;

        // find first zero
        for(int i = 0; i < n; i++) {

            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        // if no zero present
        if(j == -1) return;

        // traverse after first zero
        for(int i = j + 1; i < n; i++) {

            if(arr[i] != 0) {

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,0,1};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}



    //Find the first zero index and store it in j.
    //Traverse the array using another pointer i.
    //Whenever a non-zero element is found:
    //swap arr[i] with arr[j]
    //move j forward