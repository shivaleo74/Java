import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class inputDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = 0;

        // try {
        //     // num = System.in.read();
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     BufferedReader bf = new BufferedReader(in);
        //     num = Integer.parseInt(bf.readLine());
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // System.out.println(num);
        // // bf.close();

        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println(num);
    }
}
