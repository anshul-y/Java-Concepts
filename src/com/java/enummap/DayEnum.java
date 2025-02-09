package com.java.enummap;

public enum DayEnum {
    MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thur"), FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");

    private DayEnum(String initials){
        this.initials = this.name().toLowerCase();
    }

    private String initials;

    //MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; //not allowed

    public void displayLower(){
        System.out.println(initials);
    }
}
