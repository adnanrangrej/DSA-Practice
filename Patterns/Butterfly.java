package Patterns;

public class Butterfly {
    private static void pattern(int n){
        //upper half
        for (int i = 1; i <= n; i++) {
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //print space
            for (int j = 1; j <= 2*n - 2*i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i > 0; i--) {
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //print space
            for (int j = 1; j <= 2*n - 2*i; j++) {
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
