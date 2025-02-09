package com.java.collection.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        System.out.println("Shopping List: " + shoppingList);
        for (String item : shoppingList) {
            System.out.println(item);
            //Try to modify the list white reading
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Updated Butter white reading. ");
            }
        }
        System.out.println("Updated Shopping List: " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(1000); // Smalt delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread:" + e);
            }
        });

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list. ");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Iteml from the list");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();
    }
}