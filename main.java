import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        boolean running = true;
        System.out.println("Hello welcome to the java terminal calculator!");
        while(running){
            int choice = 0;
            System.out.println("Please make a selection:");
            System.out.println("""
                    0: Exit program
                    1: Add
                    2: Subtract
                    3: Multiply
                    4: Divide
                    5: Square root 
                    6: Factorial
                    7: Exponent
                    """);
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            sc.close();
        }

    }
}
