
enum Status{
    Pending, Initializing, Running, Stopped, Terminated;
}
public class enumDemo {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        Status s = Status.Terminated;
        // for(Status s : ss)
        // {
        //     System.out.println(s + " : " +  s.ordinal());
        // }
        switch(s)
        {
            case Pending:
                System.out.println("Pending!");
                break;
            case Initializing:
                System.out.println("Initializing...");
                break;

            case Running:
                System.out.println("Running....");
                break;

            case Terminated:
                System.out.println("Terminated!");
                break;

            case Stopped:
                System.out.println("Stopped!");
                break;
        }
    }
}
