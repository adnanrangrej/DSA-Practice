package Arrays;

public class Trapping_rainwater {
    //SOLUTION 1
    private static int total_trapped_water(int[] height){
        if (height.length<=2) {
            return 0;
        }
        
        int size = height.length;
        int leftMaxArray[] = new int[size];
        int rightMaxArray[] = new int[size];
        int result = 0;

        leftMaxArray[0] = height[0];
        rightMaxArray[size-1] = height[size-1];

        //Left Boundary and right boundary
        for(int i = 1; i<height.length; i++){
            leftMaxArray[i] = Math.max(leftMaxArray[i-1], height[i]);
            rightMaxArray[size-1-i] = Math.max(rightMaxArray[size-i], height[size-1-i]);
        }
        //Calculater result
        for(int i = 1; i<height.length;i++){
            int waterlevel = Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i];
            result = waterlevel < 0 ? result : result + waterlevel;
        }
        return result;
    }


    //SOLUTION 2
    private static int optimal_total_trapped_water(int[] height){
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        int leftMax = height[left];
        int rightMax = height[right];
        while (left<right) {
            if (leftMax<rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                result+= leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[left]);
                result+= rightMax - height[right];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4};

        System.out.println("Total Trapped water area: " + total_trapped_water(arr));
        System.out.println("Total Trapped water area: " + optimal_total_trapped_water(arr));
    }
}
