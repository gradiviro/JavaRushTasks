package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sMoney = bufferedReader.readLine();
        int money = Integer.parseInt(sMoney);
        System.out.println("Я буду зарабатывать $" + money + " в час");
    }
}
