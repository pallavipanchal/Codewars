import java.util.ArrayList;
import java.util.List;

public class OnesAndZeroes
{
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<binary.size();i++)
        {
            sb.append(binary.get(i));
        }
        int decimal=Integer.parseInt(sb.toString(),2);
        return decimal;

    }
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        int answer = ConvertBinaryArrayToInt(list);
        System.out.println(answer);
    }
}
