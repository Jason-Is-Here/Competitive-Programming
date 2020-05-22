import java.util.Scanner;

class Smallnoofnote {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
            int T =sc.nextInt();
            int den[] = {1,2,5,10,50,100};
            while(T-->0)
            {
            int N = sc.nextInt();
            int k=5,count= 0;
            while(N>0)
            {
                if(den[k] <= N){
                    count+= N/den[k];
                    N %=den[k];}
                k--;

            }
            System.out.println(count);

        }
    }
}
