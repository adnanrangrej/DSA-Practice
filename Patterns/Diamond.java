package Patterns;

public class Diamond {
    private static void pattern(int n){
        //upper half
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i > 0; i--) {
            //print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
