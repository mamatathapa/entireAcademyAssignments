package com.entireAcademy.Day2.dataTypes;

public class Day2ClassNote {
    public static void main(String[] args) {
////        byte num = 128;
////        long distance = 150000000000L;
////        float pi = 3.14f;
//        double heightInMeter = 1.85;
//        boolean isTall = true;
//        boolean isGoing = false;
//        String letter = "W";

//        int numA = 6;
//        int numB = 47;
//        int add = numA + numB;
//        int subtract = numB - numA;
//        int multiplication = numB * numA;
//        double division = numB / numA;
//        int modulo = numB % numA;
        /*
            22 / 10 = 2.2
            10 * 2 = 20;
            22 - 20 =  2;
            47 % 6 = 5
            6 * 7 = 42
            47 -  42 = 5;
         */
//        System.out.println(modulo);
//        String name = "SUMAN";
//        int nameLength = name.length();
//        int index = name.indexOf('Z');
//        String upperCase = name.toUpperCase();
//        String lowerCase = name.toLowerCase();
//        System.out.println(lowerCase);

        String sentence = "My Name name is Suman";
        boolean hasWord = sentence.toLowerCase().contains("name");
        String newSentence = sentence.replace("name", "from");
        System.out.println(newSentence);
    }


}
