
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(i);
            }
        }
		sc.close();
    }
}
