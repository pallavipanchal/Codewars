public class SquareOfSquares
{
    public static boolean isSquare(int n) {
        double t = Math.sqrt(n);
        return ((t - Math.floor(t)) == 0);

    }
    public static void main(String[] args)
    {
        int num = 26;
        boolean answer = isSquare(num);
        System.out.println(answer);
    }
}
