package com.java.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        //Method Reference -> use method without invoking and in place of lambda expression
        List<String> names = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        names.forEach(x-> System.out.println(x));
        names.forEach(System.out::println); //Method Reference, passing method as a parameter

        //Constructor reference
        List<String> phones = Arrays.asList("Samsung", "Google", "Apple");
        List<MobilePhones> mobilePhonesList = phones.stream().map(MobilePhones::new).collect(Collectors.toList());  //calling constructor of MobilePhones using new
        System.out.println(mobilePhonesList);

    }
}
class MobilePhones{
    String names;

    public MobilePhones(String names) {
        this.names = names;
    }
}
