package Threads;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;

public class clients {

    public static void main(String[] args) {

        // create a task
        Addition s1 = new Addition(2, 3);

        // create thread and hand over the task
        Thread t1 = new Thread(s1);
        System.out.println(t1.getName());


        // can we skip  creating a class just to create a new task again

        // anonymous Runnable example
        //  here annonymous class is implementing Runnable interface
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(5 + 6);
            }
        });

        t2.start();

        /* we can also override run method of thread class as
        thread also implement Runnable */

        Thread t3  = new Thread() {

            @Override
           public void run () {
                System.out.println("hello implementing Thread run method");
            }
        };
        t3.start();


        Runnable r = () -> {
            System.out.println("implenting annonymous class for creating task");
        };

        Thread t4 = new Thread(r);
        t4.start();

    }
}