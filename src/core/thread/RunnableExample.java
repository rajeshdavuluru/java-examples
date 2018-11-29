package core.thread;

public class RunnableExample implements Runnable{

    Thread t =null;
    public void start(String name){
        t =new Thread(this, name);

        System.out.println( t.getName()+"- State:-"+t.getState());

        t.start();
        System.out.println( t.getName()+"- State:-"+t.getState());
    }

    @Override
    public void run() {
        System.out.println("1111");
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + t.getName() + ", " + i);

                Thread.sleep(500);
                //t.wait();

                System.out.println( t.getName()+"- State:-"+t.getState());
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  t.getName() + " interrupted.");
        }
        System.out.println( t.getName()+"- State:-"+t.getState());
    }
}
