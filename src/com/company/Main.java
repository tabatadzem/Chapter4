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


//        String set1 = " 1 3 5 7\n"+
//                      " 9 11 13 15\n" +
//                      "17 19 21 23\n" +
//                      "25 27 29 31";
//
//        String set2 = " 2 3 6 7\n" +
//                      "10 11 14 15\n" +
//                      "18 19 22 23\n" +
//                      "26 27 30 31";
//
//        String set3 = " 4 5 6 7\n" +
//                      "12 13 14 15\n" +
//                      "20 21 22 23\n" +
//                      "28 29 30 31";
//
//        String set4 = " 8 9 10 11\n" +
//                      "12 13 14 15\n" +
//                      "24 25 26 27\n" +
//                      "28 29 30 31";
//
//        String set5 = "16 17 18 19\n" +
//                      "20 21 22 23\n" +
//                      "24 25 26 27\n" +
//                      "28 29 30 31";
//        int day = 0;
//        Scanner input = new Scanner(System.in);
//        System.out.print(set1);
//        System.out.print("\nEnter 0 for No and 1 for Yes: ");
//        int answer = input.nextInt();
//        if (answer == 1){
//            day +=1;}
//        System.out.print("\nIs your birthday in Set2?\n");
//        System.out.print(set2);
//        System.out.print("\nEnter 0 for No and 1 for Yes: ");
//        answer = input.nextInt();
//        if (answer == 1){
//            day +=2;}
//        System.out.print("\nIs your birthday in Set3?\n");
//        System.out.print(set3);
//        System.out.print("\nEnter 0 for No and 1 for Yes: ");
//        answer = input.nextInt();
//        if (answer == 1){
//            day +=4;}
//        System.out.print("\nIs your birthday in Set4?\n");
//        System.out.print(set4);
//        System.out.print("\nEnter 0 for No and 1 for Yes: ");
//        answer = input.nextInt();
//        if (answer == 1){
//            day +=8;}
//        System.out.print("\nIs your birthday in Set5?\n");
//        System.out.print(set5);
//        System.out.print("\nEnter 0 for No and 1 for Yes: ");
//        answer = input.nextInt();
//        if (answer == 1){
//            day +=16;}
//        System.out.println("\nYour birthday is " + day + "!");


//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a hex digit: ");
//        String hexString = input.nextLine();
//        if (hexString.length() != 1) {
//            System.out.println("You must enter exactly one character");
//            System.exit(1);
//             }
//        char ch = hexString.charAt(0);
//        if (ch <= 'F' && ch >= 'A') {
//            int value = ch - 'A' + 10;
//            System.out.println("The decimal value for hex digit " + ch + " is " + value);
//            }else if (Character.isDigit(ch)) {
//            System.out.println("The decimal value for hex digit " + ch + " is " + ch);}
//            else {
//                System.out.println(ch + " is an invalid input");}

//        String lottery = "" + (int)(Math.random() * 10)
//         + (int)(Math.random() * 10);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your lottery pick (two digits): ");
//        String guess = input.nextLine();
//        char lotteryDigit1 = lottery.charAt(0);
//        char lotteryDigit2 = lottery.charAt(1);
//        char guessDigit1 = guess.charAt(0);
//        char guessDigit2 = guess.charAt(1);
//        System.out.println("The lottery number is " + lottery);
//        if (guess.equals(lottery))
//            System.out.println("Exact match: you win $10,000");
//        else if (guessDigit2 == lotteryDigit1
//        && guessDigit1 == lotteryDigit2)
//        System.out.println("Match all digits: you win $3,000");
//        else if (guessDigit1 == lotteryDigit1
//                || guessDigit1 == lotteryDigit2
//                || guessDigit2 == lotteryDigit1
//                || guessDigit2 == lotteryDigit2)
//         System.out.println("Match one digit: you win $1,000");
//        else  System.out.println("Sorry, no match");

//        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
//               "Radians", "Sine", "Cosine", "Tangent");
//        int degrees = 30;
//        double radians = Math.toRadians(degrees);
//            System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
//                radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
//        degrees = 60;
//        radians = Math.toRadians(degrees);
//        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
//                 radians, Math.sin(radians), Math.cos(radians),
//                 Math.tan(radians));

//
//            Scanner input = new Scanner(System.in);
//            System.out.println("please enter the distance from the center to vertex");
//            double distance = input.nextDouble();
//            double side = 2 * distance * Math.sin(Math.PI/5);
//            double Area = (5 * side * side)/(4 * Math.tan(Math.PI/5));
//            System.out.println("the answer is "+ Math.round(Area));




//                Scanner input = new Scanner(System.in);
//                System.out.println("please enter the point 1");
//                double x1 = input.nextDouble();
//                double y1 = input.nextDouble();
//                System.out.println("please enter point the 2");
//                double x2 = input.nextDouble();
//                double y2 = input.nextDouble();
//                final double earthRadius = 6371.01;
//                double Distance = earthRadius * Math.acos(Math.sin(Math.toRadians(x1)*Math.sin(Math.toRadians(x2))
//                + Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1 - y2))));
//                System.out.println(Distance);

        double x1 = 33.7490;
        double y1 = 84.3880;
        System.out.println(" latitude and longitude of Atlanta " + "x1: "+ x1 + " and "+ "y1 "+ y1);
        double x2 = 28.5383;
        double y2 = 81.3792;
        System.out.println(" latitude and longitude of Orlando " + "x2: "+ x2 + " and "+ "y2 "+ y2);
        double x3 = 32.0835;
        double y3 = 81.0998;
        System.out.println(" latitude and longitude of Savannah " + "x3: "+ x3 + " and "+ "y3 "+ y3);
        double x4 = 35.2271;
        double y4 = 80.3431;
        System.out.println(" latitude and longitude of Charlotte " + "x4: "+ x4 + " and "+ "y4 "+ y4);
        final double earthRadius = 6371.01;
        double distanceAtlantaOrlando = earthRadius * Math.acos(Math.sin(Math.toRadians(x1)
        *Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))
        *Math.cos(Math.toRadians(y1 - y2))));
        double distanceOrlandoSavanna = earthRadius * Math.acos(Math.sin(Math.toRadians(x2)
                *Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(x3))
                *Math.cos(Math.toRadians(y2 - y3))));
        double distanceSavannaCharlotte = earthRadius * Math.acos(Math.sin(Math.toRadians(x3)
                *Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x3))*Math.cos(Math.toRadians(x4))
                *Math.cos(Math.toRadians(y3 - y4))));
        double distanceCharlotteAtlanta = earthRadius * Math.acos(Math.sin(Math.toRadians(x4)
                *Math.sin(Math.toRadians(x1)) + Math.cos(Math.toRadians(x4))*Math.cos(Math.toRadians(x1))
                *Math.cos(Math.toRadians(y4 - y1))));
        double distanceSavannahAtlanta = earthRadius * Math.acos(Math.sin(Math.toRadians(x3)
                *Math.sin(Math.toRadians(x1)) + Math.cos(Math.toRadians(x3))*Math.cos(Math.toRadians(x1))
                *Math.cos(Math.toRadians(y3 - y1))));
        double firstPart = (distanceAtlantaOrlando + distanceOrlandoSavanna + distanceSavannahAtlanta)/2;
        double areaOfFirstPart = Math.sqrt(firstPart * (firstPart - distanceAtlantaOrlando) *
                (firstPart - distanceOrlandoSavanna) * (firstPart - distanceSavannahAtlanta));
        double secondPart = (distanceSavannahAtlanta + distanceSavannaCharlotte + distanceCharlotteAtlanta)/2;
        double areaOfSecondPart = Math.sqrt(secondPart * (secondPart - distanceSavannahAtlanta)
        *(secondPart - distanceSavannaCharlotte) * (secondPart - distanceCharlotteAtlanta));
        double totalArea = areaOfFirstPart + areaOfSecondPart;
        System.out.println(" the area between four cities is: " +Math.round(totalArea));


    }
}
