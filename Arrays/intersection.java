package Arrays;

import java.util.*;

public class intersection {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 4, 6};

        intersection(arr1, arr2);
    }

    static void intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {

                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }

            else if (arr1[i] < arr2[j]) {
                i++;
            }

            else {
                j++;
            }
        }
    }
}
