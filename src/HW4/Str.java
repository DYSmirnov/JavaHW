package HW4;


import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {

    public static void main(String[] args) {
//        ex1("Сегодня на тематических зарубежных сайтах о Big Data " +
//                "можно встретить упоминание такого относительно нового для экосистемы " +
//                "Hadoop инструмента как Apache NiFi.");
//        ex2("Отель Лето");
//        ex2v2("Отель Лето");
//        ex3("Не будь как бяка.", "бяка", "[вырезано цензурой]");
//        ex4("Тридцать три коровы,\n" +
//                "Тридцать три коровы,\n" +
//                "Тридцать три коровы,\n" +
//                "Свежая стpока.\n" +
//                "Тридцать три коровы,\n" +
//                "Стих родился новый,\n" +
//                "Как стакан парного молока.", "три");
//        ex4RegEx("Тридцать три коровы,\n" +
//                "Тридцать три коровы,\n" +
//                "Тридцать три коровы,\n" +
//                "Свежая стpока.\n" +
//                "Тридцать три коровы,\n" +
//                "Стих родился новый,\n" +
//                "Как стакан парного молока.", "три");
        ex5("This is a test string");
    }


    public static void ex1(String stringEx1) {
        String[] stringArr = stringEx1.split(" ");
        int elCount = 0;
        String longWord = new String();
        for (String s : stringArr) {
            if (s.length() > elCount) {
                longWord = s;
                elCount = s.length();

            }
        }
        System.out.println("Самое длинное слово \"" + longWord + "\", в нем " +
                elCount + " букв.");
    }

    public static void ex2(String stringEx2) {
        stringEx2 = stringEx2.replaceAll(" ", "");
        String[] str = stringEx2.toLowerCase().split("");
        boolean result = false;
        for (int i = 0; i < stringEx2.length() / 2; i++) {
            if (str[i].equals(str[stringEx2.length() - 1 - i]))
                result = true;

            else {
                result = false;
                break;
            }

        }
        System.out.println(result ? "Это палиндромом" : "Это не палиндромом");
    }

    public static void ex2v2(String stringEx2) {
        stringEx2 = stringEx2.replaceAll(" ", "").toLowerCase();
        StringBuilder reverseString = new StringBuilder(stringEx2).reverse();
        System.out.println(stringEx2.equals(reverseString.toString()) ? "Это палиндромом" : "Это не палиндромом");
    }

    public static void ex3(String text, String censWord, String newWord) {
        String newString = text.replaceAll(censWord, newWord);
        System.out.println(newString);
    }

    public static void ex4(String text, String word) {
        //считает совпадения где есть точное совпадение с word
        String[] str = text.toLowerCase().split(" ");
        int count = 0;
        for (String i : str) {
            if (word.equals(i))
                count++;
        }
        System.out.println("Слово " + word + " в тексте встречается " + count + " раз.");
    }

    public static void ex4RegEx(String text, String word) {
        //считает все совпадения где есть вхождение word
        String str = text.toLowerCase();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find())
            count++;
        System.out.println(count);
    }

    public static void ex5(String text) {
        System.out.println("The given string is: " + text);
        String[] str = text.split(" ");
        StringBuilder revText = new StringBuilder();
        for (String i : str) {
            revText.append(new StringBuilder(i).reverse()).append(" ");
        }
        System.out.println("The string reversed word by word is: ");
        System.out.println(revText);
    }

}
