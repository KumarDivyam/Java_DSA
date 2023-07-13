import java.util.*;
public class LLCF {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("This");
        list.add("is");
        list.add("a");
        list.addLast("List");
        System.out.println(list);

        
        int ele = list.size();
        System.out.println(ele);

        for(int i =0 ; i<ele; i++){
            System.out.println(list.get(i));
        }

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println(list);
    
    
    
    }
}
