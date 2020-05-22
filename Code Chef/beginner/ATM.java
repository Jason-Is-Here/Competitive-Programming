import java.util.Scanner;

class ATM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double withdraw = sc.nextDouble();
        Double bal = sc.nextDouble();

        if(withdraw%5 ==0 && withdraw <= bal-0.5)
        {
               bal -= withdraw;
               bal -= 0.50;
        }
        System.out.println(String.format("%.2f",bal));
    }
}
