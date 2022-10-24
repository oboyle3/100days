public class q63 {
    public static void main(String[] args){
        int num1 =14 ;
        int num2 =14 ;

        if(num1 > num2){
            System.out.println("num1 bigger :"+num1);
        }
        else if (num2 > num1){
            System.out.println("num2  bigger :"+num2);
        }
        else if(num1 ==num2){
            System.out.println("SAME");
            int remainder1= num1 % 6;
            int remainder2= num2 % 6;
            if(remainder1 < remainder2){
                System.out.println("remaider 1 is smaller");
            }
            else{
                System.out.println("remaider 2 is smaller");
            }
        }


    }
    
}
/*Write a Java program that accepts two integer values from the user and return the larger values. 
However if the two values are the same return 0 and return the smaller value if the two values have the same remainder when divided by 6 */
