import java.util.*;
public class q53 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();

        if(num2>num1 && num3 >num2){
            System.out.println("this is True");
        }
        else{
            System.out.println("this is FALSE");
        }
        




    }
    
}

/*
 * 
 *  Write a Java program that accepts three integers from the user 
 * and return true if the second number is greater than first number and third number is greater than second number. 
 * If "abc" is true second number does not need to be greater than first number
 */
