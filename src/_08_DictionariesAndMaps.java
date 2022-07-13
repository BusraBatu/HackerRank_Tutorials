import java.util.HashMap;
import java.util.Scanner;

public class _08_DictionariesAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer>phonelist= new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here

            phonelist.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phonelist.get(s)!=null){
                System.out.println(s+"="+phonelist.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
