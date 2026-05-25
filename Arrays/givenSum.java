package Arrays;
import java.util.Arrays;
public class givenSum {
    public static void main(String[] args){
        int[] arr = {1,2,4,3,7,8};
        int sum = 5;
        Sum(arr,5);

    }

    static void Sum(int[] arr, int sum){

        for(int i=0;i<arr.length;i++){
            for(int j =i+1; j< arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(i + "," + j);
                }
            }
        }

    }
}

//we will use hashmap for optimal solution 
