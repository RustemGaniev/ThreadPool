package com.company;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        Callable<Integer> myCallable1 = new MyCallable();
        Callable<Integer> myCallable2 = new MyCallable();
        Callable<Integer> myCallable3 = new MyCallable();
        Callable<Integer> myCallable4 = new MyCallable();

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        final Future<Integer> task1 = threadPool.submit(myCallable1);
        final Future<Integer> task2 = threadPool.submit(myCallable2);
        final Future<Integer> task3 = threadPool.submit(myCallable3);
        final Future<Integer> task4 = threadPool.submit(myCallable4);

        System.out.println(task1.get());
        System.out.println(task2.get());
        System.out.println(task3.get());
        System.out.println(task4.get());

        threadPool.shutdown();

    }

}


