package Threads;

public class Addition implements  Runnable{
    Integer first;
    Integer second;

    public  Addition (Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {

        System.out.println(first + second);
    }
}
