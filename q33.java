public class q33 {
    public static void main(String[] args){
        int num = 34;
        System.out.println("sum of the digits is: "+sumD(num));

    }//end main
    public static int sumD(int n){
        int temp = 0;
        while(n != 0){
            temp += n % 10;
            n /= 10;
        }
        return temp;}

    }



/*
 * program to compute the sum of the integers
 */