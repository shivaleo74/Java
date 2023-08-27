class tr extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
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

class thr extends Thread
{
    public void run()
    {
        for(int i=1; i<=10; i++)
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

public class threadDemo {
    public static void main(String[] args) {
        tr obTr = new tr();
        thr obThr = new thr();

        obTr.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obThr.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}
