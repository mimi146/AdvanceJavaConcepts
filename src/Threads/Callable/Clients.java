package Threads.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Clients {
    /**
     * here we will use how to create threads
     * using callable to get return value
     *
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // step 1: creating a task using anonymous class implementation the callable interface
        Callable<Integer>  c = () -> {
            return  2 + 5;
        };

        //step 2: creating a Future Task instance  as a wrapper for our callable
        // passing the task to Future task ctor
        FutureTask<Integer> task = new FutureTask<>(c);


//step 3: creating Thread instance and passing the instance of Future task which was initialized with Callable instance
        Thread t1 = new Thread(task);
        // step 4 : executing the task created using callable
        t1.start();

        // setp 5 : getting the result
        System.out.println(task.get());


        //use case: where we pass the Runnable task, and we expect our predefined result if it gets executed successfully

        // step 1; create task using runnable interface and implementing in annonymous class
        // here r is the instance of annonymous class
        Runnable r   = () -> {
           var res = 5/0;
            System.out.println("making db connecting...");
        };

        // step 2: create Future Task instance by pasing our task and our predefine result
        // if db connecting is failed we will not get result as get
        FutureTask<Boolean> createDBConnection = new FutureTask<>(r,true);

        // step 3: create thread and pass the task/work to be done by thread
        Thread t2 = new Thread(r);

        t2.start();
        System.out.println( createDBConnection.get());



    }




}
