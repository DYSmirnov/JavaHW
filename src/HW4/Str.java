package HW4;



public class Str {

    public static void main(String[] args) {
        ex1("Сегодня на тематических зарубежных сайтах о Big Data " +
                "можно встретить упоминание такого относительно нового для экосистемы " +
                "Hadoop инструмента как Apache NiFi.");
        ex2("Отель Лето");
        ex3("Не будь как бяка.", "бяка", "[вырезано цензурой]");
        ex4("Тридцать три коровы,\n" +
                "Тридцать три коровы,\n" +
                "Тридцать три коровы,\n" +
                "Свежая стpока.\n" +
                "Тридцать три коровы,\n" +
                "Стих родился новый,\n" +
                "Как стакан парного молока.", "три");
        ex5("The given string is: This is a test string");
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

    public static void ex3(String text, String censWord, String newWord) {
        String newString = text.replaceAll(censWord, newWord);
        System.out.println(newString);
    }

    public static void ex4(String text, String word) {
        String[] str = text.toLowerCase().split(" ");
        int count = 0;
        for (String i : str) {
            if(word.equals(i))
                count++;
        }
        System.out.println("Слово " + word + " в тексте встречается " + count + " раз.");
    }

    public static void ex5(String text) {
        StringBuilder textSB = new StringBuilder(text);
        System.out.println(textSB.reverse());
    }

}
