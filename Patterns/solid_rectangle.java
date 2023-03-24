import java.io.InputStream;
import java.util.*;
class solid_rectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i,j=0;
        for (i= 0; i<=n; i++) {
            for(j=0;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}