import java.util.Scanner;
public class SalaryCalculator {
public static void main(String[] args) {
        int bsal;
        double tsal ,hsal,dsal,psal=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        bsal = sc.nextInt();
        if(bsal>=30000)
        {
            hsal=bsal*0.2;
            dsal=bsal*0.15;
        }
        else {
            psal=bsal*0.12;
            hsal=bsal*0.1;
            dsal=bsal*0.08;
        }
        tsal=bsal+dsal-psal+hsal;
        System.out.println("net salary = "+tsal);
        sc.close();
    }
}