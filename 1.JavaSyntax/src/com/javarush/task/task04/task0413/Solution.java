package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String ch = bufferedReader.readLine();
        int a = Integer.parseInt(ch);
        if (a==1)
            System.out.println("понедельник");
        if (a==2)
            System.out.println("вторник");
        if (a==3)
            System.out.println("среда");
        if (a==4)
            System.out.println("четверг");
        if (a==5)
            System.out.println("пятница");
        if (a==6)
            System.out.println("суббота");
        if (a==7)
            System.out.println("воскресенье");
        if (a<1 | a>7)
            System.out.println("такого дня недели не существует");
    }
}