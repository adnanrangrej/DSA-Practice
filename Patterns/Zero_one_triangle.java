package Patterns;

public class Zero_one_triangle {
    private static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //to print "1"
                if ( (i+j) % 2 == 0 ) {
                    System.out.print("1 ");
                }
                //to print "0"
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
