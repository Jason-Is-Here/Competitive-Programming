import java.util.Scanner;

 class ChefandRemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int den[] = {1, 2, 5, 10, 50, 100};
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(Math.max(A,B)+" "+(A+B));

        }
    }
}
