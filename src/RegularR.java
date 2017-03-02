import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by i.lapshinov on 02.03.2017.
 */
public class RegularR {
    /**
     *
     * @param str
     */
    public static void main(String[] str)

    {
        String[] args = {"abcabcabcdefabc","abc+","(abc)+","(abc){2,}"};

        if (args.length < 2)
        {
            System.out.println("_________________");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg : args)
        {
            System.out.println("Regulsr expression : \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
             while(m.find())
             {
                 System.out.println("Match \"" + m.group() + "\" at position" + m.start() + "-" + (m.end()-1));
             }
        }
    }
}
