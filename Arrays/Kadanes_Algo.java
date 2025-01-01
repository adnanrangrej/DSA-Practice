package Arrays;

public class Kadanes_Algo {
    private static int maxSubarraySum(int[] arr){
        int curSum = 0;
        int maxSum = arr[0];
        for(int i = 0; i< arr.length; i++){
            curSum += arr[i];
            maxSum = maxSum<curSum ? curSum : maxSum;
            curSum = curSum<0 ? 0 : curSum;
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int arr[] = { -1,-2,-3,-4,-5 };
        System.out.println(maxSubarraySum(arr));
    }
}
