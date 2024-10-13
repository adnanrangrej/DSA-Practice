package Patterns;

public class Inverted_rotated_Half_pyramid {
    private static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            //Print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
