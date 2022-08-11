import java.util.Scanner;

public class _19_Interfaces {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int number=scan.nextInt();
        Calculator2 calc= new Calculator2();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println( calc.divisorSum(number));

    }
}
interface AdvancedAritmetic{
    public int divisorSum(int n);
}
class Calculator2 implements AdvancedAritmetic{
    public int divisorSum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

