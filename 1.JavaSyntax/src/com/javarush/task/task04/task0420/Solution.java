package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();
        String sb = bufferedReader.readLine();
        String sc = bufferedReader.readLine();

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a >= b & b >=c)
            System.out.println(a + " " + b + " " + c);
        else if (a >= c & c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b >= a & a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (b >= c & c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (c >= a & a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (c >= b & b >= a)
            System.out.println(c + " " + b + " " + a);



    }
}
