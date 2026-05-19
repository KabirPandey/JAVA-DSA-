package Arrays;
import java.util.Arrays;
import java.util.Scanner;
// rotate the array to the left by 3 places.
public class rotate_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of d:");
        int d = sc.nextInt();
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(Arrays.toString(rot_arr(arr,d,n)));
        




    }

    static int[] rot_arr(int[] arr,int d , int n){

        d =d%n;
       int[] temp = new int[d];
        for(int i = 0;i<d; i++){
            temp[i] = arr[i];

        }

        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];

        }
        for(int i=n-d; i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
        return arr;
    }

    
}

