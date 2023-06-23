import java.io.InputStream;
import java.util.Scanner;
public class occurence {
    public static int first = -1;
    public static int last  = -1;
    public static void stroccur (String s,int i,char ele) {
        if(i == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = s.charAt(i);
        if( currChar == ele){
            if(first == -1)
                first = i;
            else
                last = i;
       }
       stroccur(s, i+1, ele);
    }
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        stroccur(s, 0 , c);
        
    }
}


