package Patterns;

public class Palindromic {
    private static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //print desc (i to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //print asc (2 to i)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
