public class q93{
   public static void main(String[] args){
   int [] arr = {2,4,10,12,10,1};
   // System.out.println("running: "+ test(arr));
   String end="we found a ten";
      for(int i=0;i<arr.length;i++){
           if(arr[i]  == 10 && arr[i+1]  == 10 ){
            System.out.println(end);
          }//end if

   
   
   }
   //public static String test(int [] arr){
  }
 }
/*Write a Java program to test if an array of integers contains an element 10 next to 10 or
 an element 20 next to 20, but not both*/