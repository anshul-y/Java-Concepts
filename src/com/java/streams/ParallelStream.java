package com.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        //A type of stream that enables parallel processing of elements
        //Allowing multiple threads to process parts of the stream simultaneously
        //This can significantly improve performance for large data sets
        //workload is distributed across multiple threads
        //Parallel stream are most effective for CPU-intensive or large datasets where tasks are independent
        //They may add overhead for simple tasks or small datasets

        List<Integer> nums = Stream.iterate(1, x -> x + 1).limit(20000).collect(Collectors.toList());
        long startTime = System.currentTimeMillis();
        List<Integer> seqFactorial = nums.stream().map(ParallelStream::factorial).collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Sequencial Stream: "+(endTime-startTime)+"ms");   //Time taken by Sequencial Stream: 183ms

        startTime = System.currentTimeMillis();
        List<Integer> parallelFactorial = nums.parallelStream().map(ParallelStream::factorial).collect(Collectors.toList());
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Sequencial Stream: "+(endTime-startTime)+"ms");   //Time taken by Sequencial Stream: 38ms

    }

    private static int factorial(Integer num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result*=i;
        }
        return result;
    }
}
