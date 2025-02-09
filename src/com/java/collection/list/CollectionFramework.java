package com.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFramework {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list.addAll(list2);
        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("dd"+it.next());
        }
        it.forEachRemaining(System.out::println);

        System.out.println(list.get(2));

        list.set(2, 5);
        System.out.println(list);

        System.out.println(list.contains(5));

        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
