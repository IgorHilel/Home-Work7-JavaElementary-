package com.igorberezovchuck;
/*
1. Создать 2-мерный массив (матрица) M*N и заполнить его случайными числами. Отсортировать числа по возрастанию, чтобы
с левом верхнем углу было самое маленькое число, справа от него следующее по значению, итд, в правом нижнем углу самое
большое.
 */

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    private static final int FIRST_SIDE_SIZE = 5;
    private static final int SECOND_SIDE_SIZE = 5;

    public static void main(String[] args) {

        int[][] inputArray = new int[FIRST_SIDE_SIZE][SECOND_SIDE_SIZE];
        fillArray(inputArray);
        printArray(inputArray);
        int[] tempArray = new int[FIRST_SIDE_SIZE * SECOND_SIDE_SIZE];
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                tempArray[count++] = inputArray[i][j];
            }
        }
        Arrays.sort(tempArray);
        count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] = tempArray[count++];
            }
        }
        System.out.println("");
        printArray(inputArray);
    }

    private static void fillArray(int[][] inputArray) {
        Random rand = new Random();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] = rand.nextInt(100);
            }
        }
    }

    private static void printArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(Arrays.toString(inputArray[i]));
        }
    }
}
