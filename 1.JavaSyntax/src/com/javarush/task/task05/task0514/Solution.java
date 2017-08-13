package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vaska", 40);
    }

    static class Person {
        private String name = null;
        private int age = 0;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
