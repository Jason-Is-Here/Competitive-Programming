import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class TheLeadGame {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int CsumA =0,CsumB=0,max =0;
        int Round = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<Round;i++)
        {
            CsumA += sc.nextInt();
            CsumB += sc.nextInt();

            map.put(Math.abs(CsumA-CsumB),CsumA>CsumB ?1:2);
        }
        Set<Integer> f = map.keySet();
        for(Integer s : f)
        {
            if(s>max)
                max = s;
        }

        System.out.println(map.get(max)+" "+max);

    }
}
