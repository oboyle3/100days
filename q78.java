public class q78{
    public static void main(String[] args){

        int [] arr= {1,2};

        System.out.println("verdict "+ test(arr));

    }
    public static  boolean test(int [] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1||  arr[i] == 2 ){
                System.out.println("in if ");
                return true;
            }
            
        }
        return false;
    }
}
//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7