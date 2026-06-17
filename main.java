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
                    System.out.println("Program has been terminated.");
                    break;

                case 1:
                    System.out.println(add());
                    break;

                case 2:
                    System.out.println(subtract());
                    break;

                case 3:
                    System.out.println(multiply());
                    break;

                case 4:
                    System.out.println(divide());
                    break;

                case 5:
                    System.out.println(sqrt());
                    break;

                case 6:
                    System.out.println("Enter number (nonnegative integer): ");
                    int x = sc.nextInt();

                    System.out.println(factorial(x));
                    break;

                case 7:
                    System.out.println(exp());
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

    public static double subtract(){
            System.out.println("Enter first number: ");
            double x = sc.nextDouble();

            System.out.println("Enter second number: ");
            double y = sc.nextDouble();

            return x-y;
    }

    public static double multiply(){
            System.out.println("Enter first number: ");
            double x = sc.nextDouble();

            System.out.println("Enter second number: ");
            double y = sc.nextDouble();

            return x*y;
    }

    public static double divide(){
            System.out.println("Enter first number: ");
            double x = sc.nextDouble();

            System.out.println("Enter second number: ");
            double y = sc.nextDouble();

            return x/y;
    }

    public static double exp(){
            System.out.println("Enter base number: ");
            double x = sc.nextDouble();

            System.out.println("Enter exponent number: ");
            double y = sc.nextDouble();

            return Math.pow(x, y);
    }

    public static double sqrt(){
            System.out.println("Enter number: ");
            double x = sc.nextDouble();

            return Math.sqrt(x);
    }

    public static double factorial(int x){
            if(x <= 1){
                return 1;
            }

            return x * factorial(x - 1);
    }

    public static double absVal(){
        System.out.println("Enter number: ");
        return Math.abs(sc.nextDouble());
    }

}
