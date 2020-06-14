public class Dubstep
{
    public static String SongDecoder (String song)
    {
       StringBuilder answer = new StringBuilder();
       answer.append(song.replaceAll("WUB"," "));
       String nameWithProperSpacing = answer.toString().replaceAll("\\s+", " ").trim();
       return nameWithProperSpacing;
    }
    public static void main(String[] args)
    {
        String input = "RWUBWUBWUBLWUB";
        String str = SongDecoder(input);
        System.out.println(str);
    }
}
