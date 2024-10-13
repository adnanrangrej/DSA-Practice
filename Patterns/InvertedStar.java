package Patterns;

public class InvertedStar {

    private static void pattern(int n){
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line +1; star++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}