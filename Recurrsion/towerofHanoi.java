class towerofHanoi{
    public static void toH(String s, String h,String d, int n ) {
        if(n==1){
            System.out.println("Transfer disk from "+s+"to"+d);
            return;    
        }
        toH(s, d, h, n-1);
        System.out.println("Transfere disk from"+s+"to"+d);
        toH(h, s, d, n-1);
    
    }

    public static void main(String[] args) {
        int n = 3;
        toH("Source", "Helper", "Destination", n);
    }
}