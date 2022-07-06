import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int x=1;
        for(int i=1; i<=10; i++){
            x=n*i;
            System.out.println(n+" x "+i+" = "+x);
        }
    }
}
