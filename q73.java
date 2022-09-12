import java.util.*;
public class q73 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         
        int [] arr = {10,12,43,14,18};
        test(arr);




    }
    public static boolean test(int arr []){
        if(arr[0] == arr[arr.length-1]){
            return true;
        }
        else
         return false;

    }

}
/*program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2*/