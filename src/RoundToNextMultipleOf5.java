public class RoundToNextMultipleOf5
{
    public static int roundToNext5(int number)
    {
        while(true)
        {
            if(number % 5 == 0)
                return number;
            else
                number++;
        }
    }
    public static void main(String[] args)
    {
        int num = -5;
        int answer = roundToNext5(num);
        System.out.println(answer);
    }
}
