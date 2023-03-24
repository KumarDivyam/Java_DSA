import java.util.Scanner;

import java.util.*;
public class solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i<=n ; i++)
        {
            //SPACES
            for(int j = 1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //STAR
            for(int j = 1 ; j <= n ; j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
