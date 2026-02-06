
import java.util.Scanner;
public class DigitAnalysis{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int reverse=0;
        int count=0;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            sum=sum+rem;
            count++;
            num=num/10;
        }
        System.out.println("Reverse of a number "+reverse);
        System.out.println("Sum of digits "+sum);
        System.out.println("Number of digits "+count);
        sc.close();
    }
}
