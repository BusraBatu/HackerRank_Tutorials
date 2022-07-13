import java.io.IOException;
import java.util.Scanner;

public class _11_2DArrays {
    public static void main(String[] args)  {
        Scanner scan= new Scanner(System.in);
        int arr[][]=new int [6][6];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]=scan.nextInt();
            }
        }

        int sum;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr.length-2; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if (sum>maxSum)
                {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
