package Arrays;

public class CheckArraySorted {
    public static void main(String[] args){
int arr[] = {1,4,2,5,6,8};
System.out.println(issorted(arr));

}

static boolean issorted(int arr[]){
    

    for(int i =0; i<arr.length;i++){
        if(arr[i]> arr[i+1]){
            return false;
        }
        
    }
    return true;

    


}
}
