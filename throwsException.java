class sivaException extends RuntimeException
{
    public sivaException(String string)
    {
        super(string);
    }
}

public class throwsException {
    public static void main(String[] args) {
        try{
            Class.forName("risk");
        } catch(ClassNotFoundException e){
            System.out.println("Not able to find class" + e);
        }
    }
    
}
