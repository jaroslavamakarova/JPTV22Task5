/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22task5jaroslavamakarova;
import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class JPTV22Task5JaroslavaMakarova {

    public static void main(String[] args) {
        int[][] jaggedArray = new int[5][];

        // Заполняем массив случайными числами от 50 до 100
        for (int i = 0; i < jaggedArray.length; i++) {
            int rowLength = 3 + 2 * i; // Увеличиваем длину каждой строки на 2
            jaggedArray[i] = new int[rowLength];

            for (int j = 0; j < rowLength; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 51) + 50; // Генерация чисел от 50 до 100
            }
        }

        // Выводим несортированный массив
        System.out.println("Несортированный массив:");
        printJaggedArray(jaggedArray);

        // Сортируем массив
        for (int i = 0; i < jaggedArray.length; i++) {
            Arrays.sort(jaggedArray[i]);
        }

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив:");
        printJaggedArray(jaggedArray);
    }

    // Метод для вывода зубчатого массива
    public static void printJaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

