import java.util.*;
public class q54 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();

        System.out.println("Input the result is :" +test(num1,num2,num3,true));
        System.out.println("\n");


    }
    public static boolean test(int num1,int num2, int num3, boolean xyz){
        return (num1%10 == num2%10 || num2%10 == num3%10  || num3%10 == num3%10 );
    }
}
/*Write a Java program that accepts three integers 
from the user and return true if two or more of them (integers ) have the same rightmost digit.
 The integers are non-negative */