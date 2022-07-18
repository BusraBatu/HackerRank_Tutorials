import java.util.Scanner;

public class _14_Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int [] a){
        this.elements=a;
    }
    public int computeDifference(){
        maximumDifference=0;
        int temp=0;
        for (int i : elements) {
            for (int j : elements) {
                if(i-j>0){
                    temp=i-j;

                }else{
                    temp=(i-j)*(-1);
                }
                if(temp>maximumDifference){
                    maximumDifference=temp;
                }
            }
        }
        return maximumDifference;
    }

} // End of Difference class

