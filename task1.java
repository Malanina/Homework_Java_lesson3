/*
* 1. Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
* среднее арифметическое из этого списка.
*/

import java.util.Scanner;


public class task1 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int length = scan.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Введите число: ");
            int value = scan.nextInt();
            arr[i] = value; 
        }

        int min = arr[0];
        for(int i = 0; i < length; i++) {
            if(arr[i] < min)
            min = arr[i];
        }

        int max = arr[0];
        for(int i = 0; i < length; i++) {
            if(arr[i] > max)
            max = arr[i];
        }

        double average = 0;
        if(length > 0) {
            double sum = 0;
            for(int i = 0; i < length; i++) {
                sum += arr[i];
            }
            average = sum / length;
            scan.close();
        }
        System.out.println("Список: ");

        for (int i = 0; i < length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);   
    }
}
