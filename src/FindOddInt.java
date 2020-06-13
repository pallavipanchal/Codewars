import java.util.HashMap;

public class FindOddInt
{
    public static int find_it(int[] seq)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<seq.length;i++)
        {
            if(map.containsKey(seq[i]))
                map.remove(seq[i]);
            else
                map.put(seq[i],1);
        }
        return map.keySet().stream().findFirst().get();
    }
    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,2,1,3};
        int answer = find_it(a);
        System.out.println(answer);
    }
}
