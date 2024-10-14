package Arrays;

public class Binary_search {
    private static int search(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if (arr[mid]==key) {
                return mid;
            }
            if (arr[mid]<key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 10, 11, 27, 266};
        int index = search(arr, 10);
        if (index != -1) {
            System.out.println("Index: " + index);
        }
        else{
            System.out.println("Key is not in array");
        }
    }

}