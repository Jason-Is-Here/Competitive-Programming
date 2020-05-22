import java.util.Scanner;

class Totalexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int den[] = {1, 2, 5, 10, 50, 100};
        while (T-- > 0) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            double c = a>100? a*b: (a*b - (a*b)*0.1);
            System.out.println(String.format(".6f",c));

        }
    }
}
