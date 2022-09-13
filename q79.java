public class q79 {
    public static void main(String[] args){
        int []  arr={20,30,40};
        System.out.println("larger:"+lastelement(arr));
    }
    public static int lastelement(int [] arr){
        int temp = 0;
        //for(int i = 0;i<arr.length;i++){
        int x1=arr[0];
        int x2=arr[arr.length-1];
        if(x1<x2){
            return x1;
        }
        else
            return x2;

        //}

    }
}
//Write a Java program to rotate an array (length 3) of integers in left direction
/* 
80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers . Go to the editor
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 
*/
