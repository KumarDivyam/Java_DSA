public class merge_sort {

    public static void divide(int arr[],int si,int ei) {
        if(si>=ei)
        return;
        int mid = si + (ei-si)/ 2; // we are not using (ei+si)/2 as it may lead to space complexity issue later on 
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int arr[], int si,int mid,int ei) {
    int merger[] = new int[ei-si+1];
    int i1=si;
    int i2=mid+1;
    int x =0;

    while(i1<=mid && i2<=ei)
    {
        if(arr[i1]<arr[i2])
        {
            merger[x++]=arr[i1++];
        }
        else
        {
            merger[x++]=arr[i2++];
        }
    }

    while(i1<=mid)
    merger[x++]=arr[i1++];
    
    while(i2<=ei)
    merger[x++]=arr[i2++];

    for(int i =0 , j=si; i<merger.length;i++,j++){
        arr[j]=merger[i];
    }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr,0,n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
