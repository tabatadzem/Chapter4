package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter coordinates x0 and y0");
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        System.out.println("please enter coordinates x1 and y1");
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        System.out.println("please enter coordinates x2 and y2");
//        double x3 = input.nextDouble();
//        double y3 = input.nextDouble();
//        double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
//        double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
//        double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//
//        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
//        / (-2 * b * c)));
//        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
//        / (-2 * a * c)));
//        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
//        / (-2 * a * b)));
//        System.out.println("The three angles are " +
//                    Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " +
//             Math.round(C * 100) / 100.0);

//
//         int card = (int) (Math.random()*53);
//         int suit =  (card /13);
//            int face =  (card /4);
//
//            char faceValue ='0';
//          String suitvalue = "";
//          if (face > 0 && face < 9) {
//              faceValue = (char) (49 + face);
//          }
//
//          switch(face){
//             case 0:  faceValue = 'A'; break;
//             case 9: faceValue = '1'; break;
//             case 10: faceValue = 'J'; break;
//             case 11: faceValue = 'Q'; break;
//             case 12: faceValue = 'k'; break;
//         }
//         switch (suit){
//              case 0: suitvalue = "Spades"; break;
//              case 1: suitvalue = "diamond"; break;
//             case 2: suitvalue = "club"; break;
//             case 3: suitvalue= "heart"; break;
//          }
//         System.out.println("your card is " + faceValue +" of " + suitvalue);
//
//
//      int A = 'C';
//      System.out.print(A);
//
//        char ch = 'a';
//        System.out.println("isDigit('a') is " + Character.isDigit('a'));
//        System.out.println("isLetter('a') is " + Character.isLetter('a'));
//        System.out.println("isLowerCase('a') is "
//                + Character.isLowerCase('a'));
//        System.out.println("isUpperCase('a') is "
//                + Character.isUpperCase('a'));
//        System.out.println("toLowerCase('T') is "
//                + Character.toLowerCase('T'));
//        System.out.println("toUpperCase('q') is "
//                + Character.toUpperCase('q'));


        String set1 = " 1 3 5 7\n"+
                      " 9 11 13 15\n" +
                      "17 19 21 23\n" +
                      "25 27 29 31";

        String set2 = " 2 3 6 7\n" +
                      "10 11 14 15\n" +
                      "18 19 22 23\n" +
                      "26 27 30 31";

        String set3 = " 4 5 6 7\n" +
                      "12 13 14 15\n" +
                      "20 21 22 23\n" +
                      "28 29 30 31";

        String set4 = " 8 9 10 11\n" +
                      "12 13 14 15\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31";

        String set5 = "16 17 18 19\n" +
                      "20 21 22 23\n" +
                      "24 25 26 27\n" +
                      "28 29 30 31";
        int day = 0;
        Scanner input = new Scanner(System.in);
        System.out.print(set1);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        int answer = input.nextInt();
        if (answer == 1){
            day +=1;}
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            day +=2;}
        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            day +=4;}
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            day +=8;}
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if (answer == 1){
            day +=16;}
        System.out.println("\nYour birthday is " + day + "!");



    }
}
