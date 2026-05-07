package Arrays;

public class frequency_count{
    public static void main(String[] args ){
        int[] arr = {1,2,1,3,5,3,2};
        boolean[] visited = new boolean[arr.length];
        freq_count(arr,visited);

    }

    static void freq_count(int[] arr,boolean visited[]){
        for(int i=0;i<arr.length;i++){

            if (visited[i]) continue;
            int count =1;

            for(int j =i+1 ;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                    visited[j] = true;
                }

            }
            System.out.println(arr[i]+ "->"+ count);
        }


    


    }
}


//For each element in the array, traverse the remaining array and count how many times that element appears.
//Use a visited[] array to skip elements that were already counted earlier, avoiding duplicate outputs.

 //Time Complexity: O(n²) because of nested loops.