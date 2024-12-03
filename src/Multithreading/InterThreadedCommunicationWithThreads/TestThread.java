package Multithreading.InterThreadedCommunicationWithThreads;

class Chat{
    boolean flag = false;

    public synchronized void Question(String msg){
        if(flag){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }
    public  synchronized void Answer(String msg){
        if(!flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notify();
    }
}

class T1 implements Runnable{
    Chat m;
    String[] S1 = {"Hi...","How are you ? ","I am also doing fine!"};

    public T1(Chat m1){
        this.m = m1;
        new Thread(this,"Question").start();
    }
    public void run(){
        for(int i = 0 ; i < S1.length; i++){
            m.Question(S1[i]);
        }
    }
}

class T2 implements Runnable{
    Chat m;

    String[] S2 = {"Hi...","I am good , what about you?","Great...!"};

    public T2(Chat m2){
        this.m = m2;
        new Thread(this,"Answer").start();
    }
    public void run(){
        for(int i = 0 ; i < S2.length ; i++){
            m.Answer(S2[i]);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);

    }
}
