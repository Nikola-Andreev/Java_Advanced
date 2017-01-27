package B_MultidimensionalArrays02.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerroristsWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\|(?<bomb>.*?)\\|");
        Matcher matcher = pattern.matcher(field);
        while (matcher.find()) {
            String bomb = matcher.group("bomb");
            int bombPower = 0;
            for (int i = 0; i < bomb.length(); i++) {
                bombPower += bomb.charAt(i);
            }
            bombPower %= 10;
            Pattern pattern2 = Pattern.compile(".{0," + bombPower + "}\\|.*?\\|.{0," + bombPower + "}");
            Matcher matcher2 = pattern2.matcher(field);
            matcher2.find();
            int affectedChars = matcher2.group().length();
            String bombRemovalRegex = ".{0," + bombPower + "}\\|.*?\\|.{0," + bombPower + "}";
            field = field.replaceFirst(bombRemovalRegex, new String(new char[affectedChars]).replace('\0', '.'));
        }
        System.out.println(field);
    }
}