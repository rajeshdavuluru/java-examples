package core.misc;

public class FinalizeExample {

    public void finalize(){
        System.out.println("finalize");
    }
    public static void main(String[] x){
        System.out.println("FinalizeExample");

        FinalizeExample finalizeExample1 = new FinalizeExample();
        finalizeExample1 = null;

        System.gc();
        FinalizeExample finalizeExample = new FinalizeExample();
        finalizeExample.finalize();

    }
}
