import java.util.Scanner;

 class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ec=0,oc=0;
        while (T-- > 0) {
             int N = sc.nextInt();
             if(N%2==0)
                 ec++;
             else
                 oc++;

        }
        System.out.println(ec > oc ?"READY FOR BATTLE":"NOT READY");
    }
}
