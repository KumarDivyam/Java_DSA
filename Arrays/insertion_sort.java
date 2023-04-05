public class insertion_sort {
    public static void main(String[] args) {
        int ar [] = {7,8,3,2,1,6,5,4}; 
        for (int i = 1; i < ar.length; i++) {
            int curr = ar[i];
            int j = i-1;
            while (j>=0 && curr < ar[j]) {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = curr;
        }
    
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
