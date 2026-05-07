package Arrays;

public class linear_search {

    public static void main(String[] args) {
        int element = 5;
        int arr[] = {1, 4, 5, 7, 3, 9};

        findelement(arr, element);
    }

    static void findelement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Found at index " + i);
                return; // stop after finding
            }
        }
        System.out.println("Element not found");
    }
}