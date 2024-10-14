package Arrays;

public class Reverse_array {
    private static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 10, 11, 27, 266};
        reverse(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
