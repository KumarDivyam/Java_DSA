public class selection_sort {
    public static void main(String[] args) {
        int ar [] = {7,8,3,2,1,6,5,4}; 
        for (int i = 0; i < ar.length -1; i++) {
            int smallest = i;
            for (int j = i+1; j < ar.length; j++) {
                if(ar[smallest]>ar[j])
                {
                    smallest = j;
                }
            
            }
                    int temp = ar[smallest];
                    ar[smallest] = ar[i];
                    ar[i] = temp;
            
        }
    
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
