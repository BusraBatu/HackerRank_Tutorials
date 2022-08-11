import java.util.Scanner;

public class _06_LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        while(x!=0){
            String word=scan.next();
            String l1="",l2="";
            for(int i=0;i<word.length();i++){
                //charAt() function returns the character
                //found at index "i"...
                if(i%2!=0) l2=l2+word.charAt(i);
                else l1=l1+word.charAt(i);
            }
            //adding a space between the strings and printing it...
            System.out.println(l1+" "+l2);
            x--;
        }
        scan.close();
    }
}
