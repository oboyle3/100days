import java.util.*;
public class q62 {
    public static void main(String[] args){

        Scanner in  = new Scanner (System.in);
        System.out.println("enter a number");
        int num1 = in.nextInt();
        System.out.println("Input the first number : "+num1);
        int num2 = in.nextInt();
        System.out.println("Input the first number : "+num2);
        int num3 = in.nextInt();
        System.out.println("Input the first number : "+num3);
        System.out.println( Math.abs(num1-num2) >=20 || Math.abs(num2-num3) >=20 || Math.abs(num1-num3) >=20); 

    }
    
}
//Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others
/*
 * Sample Output:
Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false
 */
