package Multithreading.MultithreadingWithoutSynchronization;

class PrintDemo{
    public void printCount(String TD){
        try{
            for(int i = 5 ; i > 0 ; i--){
                System.out.println("Counter   ---    " + i + " threadName : "+ TD);
            }
        }catch (Exception e){
            System.out.println("Thread interrrupted....");
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
            PD.printCount(this.threadName);
        System.out.println("Thread "+ threadName + " Exiting...");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

public class TestThreadWithoutSynchronization {
    public static void main(String[] args) {
        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1 ",PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2", PD);

        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        }catch(Exception e){
            System.out.println("Interrupted...");
        }

    }
}
