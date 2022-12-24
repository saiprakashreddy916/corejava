package Day2;
import java.util.Scanner;

public class operators {
    public static void main(String [] args)
    {
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter a num1 :");
         int num1 = obj.nextInt();
         System.out.println("Entered number is :" +num1);
         System.out.println("Enter a num2 :");
         int num2 = obj.nextInt();
         System.out.println("Entered number is :" +num2);
         Scanner myObj = new Scanner(System.in);
         String user;
         System.out.println("Enter operation : add, sub, mul, div"); 
         user = myObj.nextLine();  
         System.out.println("Selected Operator is: " + user); 
         switch (user)
         {
            case "add":
            System.out.println("Addition of two numbers is "+ (num1+num2));
            break;
            case "sub":
            System.out.println("Subtraction of two numbers is" + (num1-num2));
            break;
            case "mul":
            System.out.println("Multiplication of two numbers is "+ (num1*num2));
            break;
            case "div":
            System.out.println("Division of two numbers is" + (num1/num2));
            break;
            default:
            System.out.println("Invalid Operation");
         }
         
    }
}
