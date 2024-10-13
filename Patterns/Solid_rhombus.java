package Patterns;

public class Solid_rhombus {
    private static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print stars 
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}
