import java.util.StringTokenizer;

public class CamelCaseMethod
{
    public static String camelCase(String str) {
        StringTokenizer st1 = new StringTokenizer(str);
        StringBuilder answer = new StringBuilder();

        for (int i = 1; st1.hasMoreTokens(); i++)
        {
            String temp = st1.nextToken();
            answer.append(temp.substring(0, 1).toUpperCase() + temp.substring(1));
        }

        return answer.toString();
    }


    public static void main(String[] args)
    {
        String str = "hello case";
        String  answer = camelCase(str);
        System.out.println(answer);
    }
}
