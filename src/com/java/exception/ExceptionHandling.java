package com.java.exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }

        try {
            // Code that may throw an exception
        } catch (ArithmeticException ex1) {
            // Handle exception of type ExceptionType1
        } catch (Exception ex2) {
            // Handle exception of type ExceptionType2
        }

        try {
            // Code that may throw an exception
        } catch (ArithmeticException ex1) {
            // Handle exception of type ExceptionType1
        } catch (Exception ex2) {
            // Handle exception of type ExceptionType2
        } finally {
            // Code that will always execute, regardless of an exception
        }

        //try-with-resource
//        try (ResourceType resource = new ResourceType();ResourceType2 resource2 = new ResourceType2())) {
//            // Code that uses the resource
//        } catch (Exception e) {
//            // Exception handling code
//        }
//        // No need for 'finally' block to close the resource
    }

    public void test() throws Exception{
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Handle exception
            throw new Exception("Error message");
        }
    }
}
