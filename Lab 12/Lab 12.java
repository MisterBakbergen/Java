Задание 10
import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouаеёиоуыэюя".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}


Задание 11
String result = str.replace(" ", "");
System.out.println(result);


Задание 12
String[] words = str.split(" ");
String longest = "";

for (String w : words) {
        if (w.length() > longest.length()) {
longest = w;
    }
            }

            System.out.println(longest);


Задание 13
int count = str.replace(" ", "").length();
System.out.println(count);


Задание 14
        System.out.println(str.startsWith("hello"));


Задание 15
        System.out.println(str.endsWith("."));


Задание 16
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(reversed);


Задание 17
String result = str.replaceAll("\\d", "");
System.out.println(result);


Задание 18
String result = str.replaceAll("[aeiouаеёиоуыэюя]", "*");
System.out.println(result);


Задание 19
Map<Character, Integer> map = new HashMap<>();

for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);


Задание 20
        if (str.matches("\\d+"))
        System.out.println("Только цифры");
else
        System.out.println("Есть другие символы");