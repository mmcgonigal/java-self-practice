package Conditional;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        System.out.print("please input the score");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Your grade is " + grade + " .");


        char 학점 = 'C', opt = '0';
        System.out.println("Please enter your score");
        Scanner scan = new Scanner(System.in);
        int point = scan.nextInt();
        System.out.printf("Your score is %d.%n", point);
        if (point >= 90) {
            학점 = 'A';
            if (point >= 98) {
                opt = '+';
            } else if (point < 94) {
                opt = '-';
            }
        } else if (학점 >= 80) {
            grade = 'B';
            if (학점 >= 88) {
                opt = '+';
            } else if (학점 < 84) {
                opt = '-';
            }
        }


        System.out.println("what month is it?");
        int month = scan.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("It is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("It is fall");
//            case 12 : case 1 : case 2:
//                System.out.println("It is winter");
//                break;
            default:
                System.out.println("it is winter");
        }
        int num = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println((int)Math.random()*10);
            System.out.println(Math.random());
            System.out.println((int)Math.random()*11);
        }





        }





    }


