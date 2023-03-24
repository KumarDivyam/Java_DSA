import java.util.*;;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 0; 
        //UPPER HALF
        for(int i  = 1 ; i <= n ;i++)
        {   // 1ST PART
            for(int j  = 1; j <=i ; j++)
            {
                System.out.print("*");
            }
            //SPACES
            spaces = 2* (n-i);
            for(int j = 1 ; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            //2ND PART
            for(int j = 1; j<=i; j ++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        //LOWER HALF
        for(int i  = n ; i >= 1 ;i--)
        {   // 1ST PART
            for(int j  = 1; j <=i ; j++)
            {
                System.out.print("*");
            }
            //SPACES
            spaces = 2* (n-i);
            for(int j = 1 ; j <= spaces; j++)
            {
                System.out.print(" ");
            }
            //2ND PART
            for(int j = 1; j<=i; j ++)
            {
                System.out.print("*");
            }
        System.out.println();
        }

    
    }
}
