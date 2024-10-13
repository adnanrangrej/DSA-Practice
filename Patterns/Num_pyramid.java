package Patterns;

public class Num_pyramid {
    private static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print number
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
