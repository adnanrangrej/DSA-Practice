package Arrays;

public class Smallest_in_arr {
    private static int minNum(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 10,27,266,9,2,11};
        int min_num = minNum(arr);
        System.out.println("Min num in array: " + min_num);
    }
}
