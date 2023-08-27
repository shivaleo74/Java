import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class tryFinallyDemo {
    public static void main(String[] args) throws IOException {
        int i = 0;
        // BufferedReader br = null;

        // try {
        //         // InputStreamReader in = new InputStreamReader(System.in);
        //         br = new BufferedReader(new InputStreamReader(System.in));

        //         System.out.println("Enter the number: ");
        //         i = Integer.parseInt(br.readLine());
        //         System.out.println("i value is: " + i);
        // } 
        // catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("Something went wrong");
        // }
        // // Irrespective of exception finally block will be executed
        // // Finally block is to close the resources
        // finally {
        //     System.out.println("Finally block message");
        //     br.close();
        // }
        
        //Try with Resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            // InputStreamReader in = new InputStreamReader(System.in);
            System.out.println("Enter the number: ");
            i = Integer.parseInt(br.readLine());
            System.out.println("i value is: " + i);
        } 
    }
}
