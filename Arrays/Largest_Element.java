package Arrays;

public class Largest_Element {
    public static void main(String[] args){

        int[] arr = {1,4,3,5,6,7,2};
        System.out.println(maxelement(arr));

        
    }

    static int maxelement(int[] arr ){

            int max = arr[0];

            for(int i = 1; i < arr.length; i++){
                if(max<arr[i]){

                    max = arr[i];
                }

            
            }
            return max;


        }
}
