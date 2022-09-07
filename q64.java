import java.util.*;
public class q64 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number1 :");
        int num1 = in.nextInt();
        System.out.println("enter a number2 :");
        int num2 = in.nextInt();
        System.out.println(test(num1,num2));
      
    }   
    public static boolean test(int num1, int num2){
        if(num1<25 || num2 >75)
            return false;
        int x = num1 %10;
        int y = num2 %10;
        num1/=10;
        num2/=10;
        System.out.print(num1 == num2 || num1 == y || x == num2 || x == y );
        return true;

        
    }
   
}
//Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers
