package Arrays;

public class Count_vowel {
    public static void main(String[] args){

        String str = "Kabir";
        System.out.println(count_vowel(str));


    }

    static int count_vowel(String str){
        int count =0;

        for(int i =0 ; i<str.length(); i++){
             char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }
        return count;
    }
}
