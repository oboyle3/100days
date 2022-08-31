
/*this program swaps two numbers*/
public class q15 {
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 3;
        System.out.println("before swap "+ num1+","+num2);
        int temp = 1;
        //
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("before AFTER "+ num1+","+num2);
    }
}
