import javax.xml.transform.Result;
import java.io.*;

public class _09_Recursion3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = _09_Recursion3.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int factorial(int n) {
        // Write your code here
        if(n==1)return 1;
        return factorial(n-1)*n;
    }
}
