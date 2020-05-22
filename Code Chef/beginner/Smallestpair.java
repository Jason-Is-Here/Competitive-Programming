import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Smallestpair {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-->0)
        {
            int N= Integer.parseInt(br.readLine());
            String f[] = br.readLine().split(" ");
            int k[] = new int[N];
            for(int i = 0;i<N;i++)
                k[i] = Integer.parseInt(f[i]);
            Arrays.sort(k);
            System.out.println((long)(k[0]+k[1]));
        }
    }
}
