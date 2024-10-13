package Arrays;

public class Largest_in_arr {
    private static int maxNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 10,27,266,9,2,11};
        int max_num = maxNum(arr);
        System.out.println("Max num in array: " + max_num);
    }
}
