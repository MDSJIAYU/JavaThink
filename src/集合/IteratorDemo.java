package 集合;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ",");
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ",");
        }
        for (Integer i : list) {
            System.out.print(i + ",");
        }
    }
}
