import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressioin {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[am]");
        Matcher m =p.matcher("ammanamanndafgh");
        int c=0;
        while(m.find())
        {
            c++;
        }
        System.out.println(c);
    }
}
