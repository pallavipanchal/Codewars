import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }
        int countX = map.containsKey('x') ? map.get('x') : 0;
        int countO = map.containsKey('o') ? map.get('o') : 0;
        System.out.println("CountX " + countX + " CountO " + countO);
        return countO == countX;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean answer = getXO(str);
        System.out.println(answer);

    }
}
