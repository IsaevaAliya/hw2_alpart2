import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание первых 5 строк и сохранение их в Список А
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        // Отображение Списка А
        System.out.println("Список A: " + listA);

        // Считывание следующих 5 строк и сохранение их в Список Б
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        // Отображение Списка Б
        System.out.println("Список B: " + listB);

        // Объединение Списка А и Списка Б в новый Список С
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        // Отображение Списка С
        System.out.println("Список C: " + listC);

        // Сортировка Списка С по длине строки
        listC.sort(Comparator.comparingInt(String::length));

        // Отображение отсортированного Списка С
        System.out.println("Отсортированный список C: " + listC);
    }
}




