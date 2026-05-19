package Arrays;

import java.util.Arrays;

public class SeparateEvenOdd {

    public static void moveZeros(int[] arr) {

        int n = arr.length;

        int j = -1;

        
        for(int i = 0; i < n; i++) {

            if(arr[i] %2 != 0) {
                j = i;
                break;
            }
        }

        
        if(j == -1) return;

        
        for(int i = j + 1; i < n; i++) {

            if(arr[i]%2 == 0) {

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,8,2,3,7,4,2,1};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}



    //Find the first zero index and store it in j.
    //Traverse the array using another pointer i.
    //Whenever a non-zero element is found:
    //swap arr[i] with arr[j]
    //move j forward
