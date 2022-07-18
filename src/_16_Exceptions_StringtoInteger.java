import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16_Exceptions_StringtoInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
            System.out.println(Integer.valueOf(S));
        }catch(IllegalArgumentException e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
