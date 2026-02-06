
import java.util.Scanner;
public class NumberClassificationTool {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        if(num%5==0 && num%7==0){
            System.out.println("Number is divisible by both 5 and 7");
        }
        else{
            System.out.println("Number is not divisible by 5 and 7");
        }
		sc.close();
    }
}
