package Arrays;

public class Linear_search {
    private static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10,27,266,9,2,11};
        int result = linearSearch(arr, 266);
        if (result!= -1) {
            System.out.println("index: " + result);
        }
        else{
            System.out.println("Key is not in array");
        }
    }
}
