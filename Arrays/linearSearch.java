
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int f =sc.nextInt();

        for(int j = 0 ; j< arr.length ; j++)
        {
            if(arr[j] == f)
            {
                System.out.println("Element found at index:" + j);
            }
        }
    }
    
}
