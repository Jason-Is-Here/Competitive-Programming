import java.util.Scanner;

class Servent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int den[] = {1, 2, 5, 10, 50, 100};
        while (T-- > 0) {

            System.out.println(sc.nextInt() < 10 ? "What an obedient servant you are!":"-1");
        }
    }
}
