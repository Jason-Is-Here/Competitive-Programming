import java.util.Scanner;

 class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
        String g = sc.next();
        System.out.println(new StringBuffer(g).reverse().toString().equals(g)?"wins":"losses");
        }
    }
}
