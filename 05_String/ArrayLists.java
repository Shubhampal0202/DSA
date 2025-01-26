import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list + "-> " + list.size());
        list.add(10); // Add from last
        list.add(20);
        list.add(30);
        System.out.println(list + "-> " + list.size());
        list.add(1, 1000); // Add anywhere
        System.out.println(list + "-> " + list.size());
        int val = list.get(1); // Get element
        System.out.println(val);
        list.set(1, 2000); // set(update) element
        System.out.println(list + "-> " + list.size());
        list.remove(1); // delete Element
        System.out.println(list + "-> " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int val1 : list) {
            System.out.println(val1);
        }
    }
}
