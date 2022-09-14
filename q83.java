import java.util.*;
public class q83 {
    public static void main(String[] args){
        int [] arr1 = {1, 3, -5, 4};
        int [] arr2 = {1, 4, -5, -2};
        String result = "";
       // int [] arr3 = { arr1[0]*arr2[0],   arr1[1]*arr2[1], arr1[2]*arr2[2], arr1[3]*arr2[3]                       };
       System.out.println("\nArray1: "+Arrays.toString(arr1));  
	   System.out.println("\nArray2: "+Arrays.toString(arr2)); 
       for (int i = 0; i < arr1.length; i++) {
				int num1 = arr1[i];
				int num2 = arr2[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: "+result);   
    }
    
}
/*83. Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8 */