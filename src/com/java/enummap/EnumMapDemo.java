package com.java.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        //Map<DayEnum, String> map = new HashMap<>();
        Map<DayEnum, String> map = new EnumMap<>(DayEnum.class);
        map.put(DayEnum.TUESDAY, "Gym");
        map.put(DayEnum.MONDAY, "Walk");
        System.out.println(map);    //{MONDAY=Walk, TUESDAY=Gym}

        DayEnum.TUESDAY.displayLower();  //tuesday
    }
}
