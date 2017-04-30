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


         int card = (int) (Math.random()*53);
         int suit =  (card /13);
            int face =  (card /4);

            char faceValue ='0';
          String suitvalue = "";
          if (face > 0 && face < 9) {
              faceValue = (char) (49 + face);
          }

          switch(face){
             case 0:  faceValue = 'A'; break;
             case 9: faceValue = '1'; break;
             case 10: faceValue = 'J'; break;
             case 11: faceValue = 'Q'; break;
             case 12: faceValue = 'k'; break;
         }
         switch (suit){
              case 0: suitvalue = "Spades"; break;
              case 1: suitvalue = "diamond"; break;
             case 2: suitvalue = "club"; break;
             case 3: suitvalue= "heart"; break;
          }
         System.out.println("your card is " + faceValue +" of " + suitvalue);


      int A = 'C';
      System.out.print(A);

    }
}
