package Multithreading.ByExtendingThreadClass;

class ThreadDemo extends Thread{
    private Thread  t;
    private String threadName;

    ThreadDemo(String name){
        System.out.println("Creating : "+threadName);
        threadName =  name;
    }

    public void run(){
        System.out.println("Running : "+threadName);
        try{
           for(int i = 0 ; i < 5 ; i++){
               System.out.println("Independent Thread -  "+threadName+" :  "+ i);
               Thread.sleep(5000);
           }
        }catch (InterruptedException e){
            System.out.println("Thread : "+threadName+ "interrupted.");
        }
        System.out.println("Thread - "+threadName+"  : exiting...");
    }

    public void start(){
        System.out.println("Thread starting : "+threadName);
        if(t == null){
            t = new  Thread(this,threadName);
            t.start();
        }
    }

}
public class Test2hread {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo("Thread | 1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread | 2");
        T2.start();
    }
}
