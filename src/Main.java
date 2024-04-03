import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите IPv6: ");
        String input = in.nextLine();

        Pattern pattern = Pattern.compile(
                    "(^|\\s)(((([0-9a-fA-F]{1,4}:){7})([0-9a-fA-F]{1,4}))|"+
                          "((([0-9a-fA-F]{1,4}:){1,7}):)|"+
                          "((([0-9a-fA-F]{1,4}:){1,6})(:([0-9a-fA-F]{1,4})))|"+
                          "((([0-9a-fA-F]{1,4}:){1,5})(:([0-9a-fA-F]{1,4})){1,2})|"+
                          "((([0-9a-fA-F]{1,4}:){1,4})(:([0-9a-fA-F]{1,4})){1,3})|"+
                          "((([0-9a-fA-F]{1,4}:){1,3})(:([0-9a-fA-F]{1,4})){1,4})|"+
                          "((([0-9a-fA-F]{1,4}:){1,2})(:([0-9a-fA-F]{1,4})){1,5})|"+
                          "(([0-9a-fA-F]{1,4}:)(:([0-9a-fA-F]{1,4})){1,6})|"+
                          "(:(((:[0-9a-fA-F]{1,4}){1,7})|:)))($|\\s)"
        );
        Matcher matcher = pattern.matcher(input);

        while (matcher.find())
        {
            System.out.println("Верный IPv6: " + matcher.group());
        }
    }
}