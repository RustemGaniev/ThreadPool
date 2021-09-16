package com.company;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws InterruptedException {

        Integer i;
        int callKey = 12;
        int max = (int) (Math.random() * callKey);
        String threadName = "" + max;
        Thread.currentThread().setName(threadName);

        for (i = 0; i < max; i++) {
            Thread.sleep(2000);
            System.out.println("\n Я поток " + Thread.currentThread().getName() + ". Всем большой привет! \n");
        }
        return i;
    }
}


