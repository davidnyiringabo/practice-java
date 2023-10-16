package learn.mosh;

import java.util.LinkedList;

public class DefaultLinkedLists {
    public static void main(String[] args){
        var list = new LinkedList();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
