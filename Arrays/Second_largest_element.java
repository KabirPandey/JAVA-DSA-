package Arrays;

public class Second_largest_element {
     public static void main(String[] args){

        int[] arr = {1,4,3,5,6,7,9};
        System.out.println(sec_lar(arr));

        
    }

    static int sec_lar(int[] arr ){

            int max = arr[0];

            for(int i = 1; i < arr.length; i++){
                if(max<arr[i]){

                    max = arr[i];
                }

            
            }
            int secmax = -1;

            for(int i = 0; i < arr.length; i++){
                if(secmax<arr[i] && arr[i] != max){

                    secmax = arr[i];
                }

                

            
            }
            return secmax;




        }

/*         static int second_large(int[] arr){
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int i = 0; i < arr.length; i++){
        if(arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
        }
        else if(arr[i] > secondLargest && arr[i] != largest){
            secondLargest = arr[i];
        }
    }

    return secondLargest;
}

  */     
}

/*Traverse the array once to find the maximum element.
Then traverse again to find the largest element that is not equal to the maximum.
That element is the second largest.*/
