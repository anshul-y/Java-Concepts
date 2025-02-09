package com.java.system;

import java.util.Map;

public class SystemClass {
    public static void main(String[] args) {

        //System is a class that contains methods that interact with system's runtime environment(infra provided by JRE)
        //out is a static member of class that is connected with console
        Map<String, String> envMap = System.getenv();

        System.out.print(1); //need 1 arg, same line
        System.out.println(); //can have 0 arg, next line
        System.out.printf("aa"); //need min 1 arg, same line(format specifier)
        int a = 1;
        int b = 2;
        String s = "Sum";
        System.out.println(s + " of " + a + " & " + b + ": " + (a + b));
        System.out.printf("%s of %d & %d: %d",s,a,b,a+b);
        //%c char
        //%d int
        //%f float(default 6 digit decimal)
        //%s string
        //%n line separator

        System.exit(0); //exit JVM, 0 means normal termination

        System.gc(); //request JVM to run garbage collector

    }
}
