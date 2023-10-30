import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(System.in);

        System.out.print("Enter a letter: ");
        String c = Character.toString((char)reader.read());

        Pattern vowel = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Pattern consonant = Pattern.compile("[[^aeiou]&&[a-z]]", Pattern.CASE_INSENSITIVE);

        if (vowel.matcher(c).find()) {
            System.out.printf("%s is a vowel", c);
        } else if (consonant.matcher(c).find()) {
            System.out.printf("%s is a consonant", c);
        } else {
            System.out.printf("%s is an invalid input", c);
        }
    }
}
