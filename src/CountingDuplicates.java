import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates
{
    public static int duplicateCount(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        text = text.toLowerCase();
        for(int i = 0;i<text.length();i++)
        {
            if(map.containsKey(text.charAt(i)))
            {
                int val = map.get(text.charAt(i))+1;
                map.put(text.charAt(i),val);
            }
            else
                map.put(text.charAt(i),1);
        }
        for (Map.Entry<Character, Integer> set : map.entrySet())
        {
            if(set.getValue() > 1)
                count++;

        }
        return count;
    }
    public static void main(String[] args)
    {
        String str = "Indivisibilities";
        int answer = duplicateCount(str);
        System.out.println(answer);
    }
}
