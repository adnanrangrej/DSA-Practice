public class SupportFunctions {
    
    public static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void printMatrix(int arr[][]){
        for (int[] is : arr) {
            for (int item : is) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

}
