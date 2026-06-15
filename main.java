import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean running = true;
        System.out.println("Hello welcome to the java terminal calculator!");
        while(running){
            int input = 0;
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
                    8: Absolute Value 
                    """);
            input = sc.nextInt();
            
            
            
            switch(input){
                case 0:
                    running = false;
                    System.out.println("Program has been terminated.")
                    break;

                case 1:
                    System.out.println(add());
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    System.out.println(absVal());
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
        
        
    }

    public static double add(){
            System.out.println("Enter first number: ");
            double x = sc.nextDouble();

            System.out.println("Enter second number: ");
            double y = sc.nextDouble();

            return x+y;
    }

    public static double absVal(){
        System.out.println("Enter number: ");
        return Math.abs(sc.nextDouble());
    }

}
