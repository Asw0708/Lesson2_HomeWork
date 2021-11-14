package NomeWork_2;

import java.util.Scanner;

public class HomeWork2 {

    public static boolean chekTheAmount() {
        int a = 20;
        int b = 5;
        if ((a + b) >= 10 && (a + b) <= 20) {
           return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        chekTheAmount();
        numberPositiveNegative();
        chekValidation();
        printWord("String word", 3);
        chekYear();

    }
    public static void numberPositiveNegative() {
        int a = -1;
        if (a < 0) {
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }
    }
    public static boolean chekValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWord(String word, int amount) {
        for (int j = 0; j <= amount; j++) {
            System.out.println(word);
        }
    }
    public static void chekYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки: ");
        int year = scanner.nextInt();
        if(((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        scanner.close();
    }

}
