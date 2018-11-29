package core.thread;

public class RunnableMain {
    public static void main(String[] x){
        System.out.println("RunnableMain");

        RunnableExample runnableExample = new RunnableExample();
        runnableExample.start("Thread1");
       // runnableExample.run();
    }
}
