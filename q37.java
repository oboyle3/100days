import java.util.*;
public class q37 {
    public static void main(String[] args){
        String word = "Hello";
       // char []  letters = word.toString();
       Scanner scanner=new Scanner (System.in);
       System.out.println("enter a string: ");
       char [] letters = scanner.nextLine().toCharArray();
       System.out.println("reversed Word string: ");
       for(int i =letters.length-1;i >= 0;i--){
        System.out.print(letters[i]);
       }



    }
    
}
/*reverse a string */
