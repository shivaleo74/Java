class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class threadSafeMutationDemo {
    public static void main(String[] args) {
        Counter objc = new Counter();

        Runnable obTr = () ->
        {
                for(int i=1; i<=1000; i++)
                {
                    objc.increment();
                }   
        };
        Runnable obThr = () ->
        {
                for(int i=1; i<=1000; i++)
                {
                    objc.increment();
                }   
        };

        Thread t1 = new Thread(obTr);
        Thread t2 = new Thread(obThr);

        t1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(objc.count);
    }
}
