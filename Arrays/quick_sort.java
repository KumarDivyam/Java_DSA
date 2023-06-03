public class quick_sort {

    public static int partition(int arr[],int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
                if(arr[j]<pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high]  =temp;
            return i;
    }
    public static void qs(int arr[],int low,int high) {
        if(low<high){
            int pind =partition(arr,low,high);
            qs(arr, low, pind-1);
            qs(arr,pind+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,1,4};
        int n = arr.length;

        qs(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
