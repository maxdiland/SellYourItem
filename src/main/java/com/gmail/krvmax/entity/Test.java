package com.gmail.krvmax.entity;

import java.util.Properties;
import java.util.Set;
import java.util.concurrent.*;

/**
 * author: Maxim Diland
 */
public class Test {
    public static void main(String[] args) {
        Set keys = System.getProperties().keySet();

        for (Object key : keys) {
            System.out.println(key + ": " + System.getProperty( (String) key ));
        }
    }
}

class OtherTest {
    public static void main(String[] args) {
        class MyCallable implements Callable<Integer> {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i < 1000; i++) {
                    result += i;
                }

                while (true) {
                    if (false) {
                        break;
                    }
                }
                return result;
            }
        }


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = executorService.submit(new MyCallable());
        Future<Integer> future2 = executorService.submit(new MyCallable());

        executorService.shutdown();
        try {
            executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        int collaboratedResult = 0;
        try {
            collaboratedResult = future1.get() + future2.get();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExecutionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        System.out.println(collaboratedResult);


    }
}
