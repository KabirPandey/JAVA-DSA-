package Arrays;

public class reverse_string {
    public static void main(String[] args){
        String str ="kabir";
        System.out.println(rev_string(str));
        System.out.println(rev_String(str));

    }
    static String rev_string(String str){
        char[] arr = str.toCharArray();
        int left =0;
        int right = arr.length-1;

        while(left<right){
            
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        return  new String(arr);


    }

    static String rev_String(String str){
        StringBuilder sb = new StringBuilder();

        for(int i =str.length()-1; i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}


