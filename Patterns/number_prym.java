import java.util.*;
public class number_prym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i ++)
        {
            //space
            for(int j = 1 ; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //number
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(i + " ");
            }  
        System.out.println();
        }
    }
}
