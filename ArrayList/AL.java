import java.util.Collections;
import java.util.ArrayList;
class AL{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //ADD
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //GET ELEMENT
        int ele = list.get(1);
        System.out.println(ele);

        //ADD IN BETWEEN
        list.add(3, 3);
        System.out.println(list);

        //REPLACE
        list.set(0, 5);
        System.out.println(list);

        //REMOVE
        list.remove(1);
        System.out.println(list);

        //SORT
        Collections.sort(list);
        System.out.println(list);
    }
}