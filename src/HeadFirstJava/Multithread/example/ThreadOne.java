package HeadFirstJava.Multithread.example;

public class ThreadOne implements Runnable {
    Accum a = Accum.getAccum();
    @Override
    public void run(){
        for (int x=0;x<20;x++){
            a.updateCounter(1000);
            try{
                Thread.sleep(50);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("one "+a.getCount());
        }
    }
}
