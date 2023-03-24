import java.math.*;
public class pascal_tri {
public static void main(String[] args) {
    int  n = 4;
    for(int i = 0 ; i<=n; i++ )
    {
        //spaces
        for(int j = 0; j<=n-i; j++)
        {
            System.out.print(" ");
        }
        //pascal series
        for (int j = 1; j<=i; j++)
        {   
            int m =(int) Math.pow(11,i);
            System.out.print(m+ " ");
        }
    System.out.println();
    }
}    
}
