public class Clock
{
    public static int Past(int h, int m, int s)
    {
        int milliseconds = (h * 3600000) + (m * 60000) + (s * 1000);
        return milliseconds;
    }
    public static void main(String[] args)
    {
        int answer = Past(0,1,1);
        System.out.println(answer);
    }
}
