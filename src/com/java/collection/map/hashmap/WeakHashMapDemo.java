package com.java.collection.map.hashmap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> weakHashMap = new WeakHashMap<>();
        loadImage(weakHashMap);
        System.out.println(weakHashMap);
        System.gc();
        simulateWork();
        System.out.println(weakHashMap);
    }

    private static void loadImage(WeakHashMap<String, Image> weakHashMap) {
        String str1 = new String("str1");
        String str2 = new String("str2");
        weakHashMap.put(str1, new Image("image1"));
        weakHashMap.put(str2, new Image("image2"));
    }

    public static void simulateWork() {
        try {
            System.out.println("Doing work...");
            Thread.sleep(10000);
        } catch (Exception ignored) {
        }
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Image{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
