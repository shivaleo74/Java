class tr implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("You");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}

class thr implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("Me");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }   
    }
}

public class threadRunnableDemo {
    public static void main(String[] args) {
        Runnable obTr = new tr();
        Runnable obThr = new thr();

        Thread t1 = new Thread(obTr);
        Thread t2 = new Thread(obThr);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}
