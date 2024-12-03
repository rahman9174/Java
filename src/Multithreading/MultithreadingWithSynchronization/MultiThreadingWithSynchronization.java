package Multithreading.MultithreadingWithSynchronization;

class PrintDemo{
    public void printCount(String PD){
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println("Counter  ---  "+ i + " ThreadName "+ PD);
            }
        }catch (Exception e){
            System.out.println("Thread  Interrupted...");
        }
    }
}

class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo(String name , PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run(){
        synchronized (PD){
            PD.printCount(threadName);
        }
        System.out.println("Thread "+  threadName + " exiting...");
    }
    public void start(){
        System.out.println("starting thread : "+threadName);
        if(t == null ){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

public class MultiThreadingWithSynchronization {
    public static void main(String[] args) {
        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
        ThreadDemo T2 = new ThreadDemo("ThreadDemo - 2",PD);

        T1.start();
        T2.start();

        try{
            T1.join();
            T2.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
