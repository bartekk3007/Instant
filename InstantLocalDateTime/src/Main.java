import java.time.Instant;

public class Main
{
    public static void main(String[] args)
    {
        Instant i1 = Instant.now();
        System.out.println(i1);
        var i2 = Instant.ofEpochMilli(1_000_000_000);
        System.out.println(i2);
    }
}