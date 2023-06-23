import java.util.Scanner;
public class revString {
    public static void rev(String s, int idx) {
        if(idx == 0){
            System.out.println(s.charAt(idx));      
        }
        System.out.println(s.charAt(idx));
        rev(s,idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s, s.length()-1);
    }
}