package com.igorberezovchuck;
/*
2. Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {
        getCountsFromFile("test.txt");
    }

    public static void getCountsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int words = 0;
            int lines = 0;
            int symbolsWithSpaces = 0;
            int symbolsWithOutSpaces = 0;
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                lines++;
                String[] array = currentLine.split(" ");
                words += array.length;
                symbolsWithSpaces += currentLine.length();
                for (int i = 0; i < array.length; i++) {
                    symbolsWithOutSpaces += array[i].length();
                }
            }

            System.out.println("Number of words: " + words);
            System.out.println("Number of lines: " + lines);
            System.out.println("Number of symbols with spaces of lines: " + symbolsWithSpaces);
            System.out.println("Number of symbols without spaces of lines: " + symbolsWithOutSpaces);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
