class U  
{
    public void show() throws ClassNotFoundException
    {
        // try{
            Class.forName("risk");
        // } catch(ClassNotFoundException e){
        //     System.out.println("Not able to find class" + e);
        // }
    }
}

public class throwsException2 {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) 
    {
        U obju = new U();
        try {
            obju.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
