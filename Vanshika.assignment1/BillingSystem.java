
import java.util.Scanner;
public class BillingSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item Price");
        int price=sc.nextInt();
        System.out.println("Enter item Quantity");
        int quantity=sc.nextInt();
        double bill=price*quantity;
        if(bill>=2000){
            bill=bill-(5*bill/100);
        }
        else if(bill>=5000){
            bill=bill-(bill*10/100);
        }
        bill=bill+(18*bill/100);
        System.out.println("Payable amount "+bill);
        sc.close();
    }
}
