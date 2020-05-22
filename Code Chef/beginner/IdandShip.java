import java.util.HashMap;
import java.util.Scanner;

 class IdandShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int den[] = {1, 2, 5, 10, 50, 100};
        while (T-- > 0) {
            String g = sc.next().toUpperCase();

            HashMap<String,String> map = new HashMap<>();
            map.put("B","BattleShip");
            map.put("F","Frigate");
            map.put("D","Destroyer");
            map.put("C","Cruiser");

            System.out.println(map.get(g));

        }
    }
}
