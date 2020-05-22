import java.util.Scanner;

public class ChefandOper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int den[] = {1, 2, 5, 10, 50, 100};
        while (T-- > 0) {

            int A = sc.nextInt();
            int B= sc.nextInt();

            char c = A < B ? '<':'>';

            System.out.println(A==B ? '=':c);
        }
    }

}
