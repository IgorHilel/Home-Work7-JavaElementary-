package com.igorberezovchuck;
/*
3. Есть List объектов у каждого из которых 2 поля: int и String. Удалить те у которых значения int повторяются(оставить
по одному из дубликатов).
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    private static final int USERS_COUNTS = 5;

    public static void main(String[] args) {
        List<Task3MyObject> myList = new ArrayList<>();
        for (int i = 0; i < USERS_COUNTS; i++) {
            Task3MyObject temp = new Task3MyObject();
            temp.setRandomNums(2);
            myList.add(temp);
        }
        System.out.println("Мой лист: \n" + myList);
        Set<Integer> mySet = new HashSet<>();
        int tempSetSize = 0;
        for (int i = myList.size() - 1; i >= 0; i--) {
            mySet.add(myList.get(i).getNums());
            tempSetSize++;
            if (tempSetSize != mySet.size()) {
                myList.remove(i);
            }
        }
        System.out.println("Мой лист без дубликатов: \n" + myList);
    }
}
