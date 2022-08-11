import java.util.Scanner;

public class _25_RunningTimeAndComplexity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number-- > 0) {
            int x = scan.nextInt();
            if (x >= 2 && isPrime(x)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }


    static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}




