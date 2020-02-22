package com.igorberezovchuck;
/*
4*. Задана строка с датой вида "22.01.2019 19:15:00". Написать метод который преобразовывает ее в формат
"22 Jan, 7:15 PM". Предусмотреть обработку ситуации если входящая дата в недопустимом формате.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task4 {

    private static final String INPUT_DATE = "22.01.2019 19:15:00";

    private static final String INPUT_DATE_FORMAT = "dd.MM.yyyy HH:mm:ss";
    private static final String OUTPUT_DATE_FORMAT = "d MMM. h:mm a";

    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat(INPUT_DATE_FORMAT);

        try {
            Date date = dateFormat.parse(INPUT_DATE);
            String newDate = formatDate(date);
            System.out.println(newDate);

        } catch (ParseException e) {
            System.out.println("Входящая дата в недопустимом формате.");
            e.printStackTrace();
        }

    }

    private static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(OUTPUT_DATE_FORMAT, Locale.US);
        return dateFormat.format(date);
    }
}
