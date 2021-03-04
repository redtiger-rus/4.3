import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyApp {
    public static void main(String[] args) {
//        StringBuilder strBuilder = new StringBuilder("2000 ");
//        for (int aYear = 2000; aYear < 2100; aYear++) {
//            strBuilder.append(aYear + " ");
//        }
//        System.out.println(strBuilder);
//            String text = "aba aba a!a abba adca abea";
//            String text = "Всем привет! Как у *тебя* дела?";
            String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";

//        Pattern pattern = Pattern.compile("a..a");            //      4.3.2 - Поиск строки a**a
//        Pattern pattern = Pattern.compile("(ab)+");           //      4.3.3 - Поиск строк ab
//        Pattern pattern = Pattern.compile("20\\d{2}");        //      4.3.4 - Поиск все года 21 века
//        Pattern pattern = Pattern.compile("\\*[а-яА-Я]+\\*"); //      4.3.5 - Поиск русских слов между звёздочками
        Pattern pattern = Pattern.compile("strings"); //      4.3.5 - Поиск русских слов между звёздочками

//        Matcher matcher = pattern.matcher(strBuilder);
        Matcher matcher = pattern.matcher(text);
        int matchCounter = 0;
        while (matcher.find()) {
            matchCounter++;
            System.out.println("Match: #" + matchCounter + " is " + matcher.group() + " (start:" + matcher.start() + " end:" + matcher.end() + ")");
        }
    }
}
