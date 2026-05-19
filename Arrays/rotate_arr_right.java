package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// rotate the array to the right by d places
public class rotate_arr_right {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();

        int[] arr = {1,2,3,4,5,6};

        int n = arr.length;

        System.out.println(Arrays.toString(rot_arr(arr,d,n)));

        sc.close();
    }

    static int[] rot_arr(int[] arr,int d , int n){

        d = d % n;

        int[] temp = new int[d];

        // store last d elements
        for(int i = n-d; i < n; i++){
            temp[i-(n-d)] = arr[i];
        }

        // shift remaining elements right
        for(int i = n-d-1; i >= 0; i--){
            arr[i+d] = arr[i];
        }

        // place temp elements at beginning
        for(int i = 0; i < d; i++){
            arr[i] = temp[i];
        }

        return arr;
    }
}