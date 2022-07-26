package Conditional;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        int score = 0;
        char grade =' ';
        System.out.print("please input the score");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >=90 ){
            grade ='A';
        }else if (score >=80){
            grade='B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Your grade is " + grade + " .");


        char 학점 = 'C',opt = '0';
        System.out.println("Please enter your score") ;
        Scanner scan = new Scanner(System.in);
        int point =scan.nextInt();
        System.out.printf("Your score is %d.%n",point );
        if(point >=90){
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
            }else if (학점 < 84){
                opt = '-';
            }
        }

        }





    }
}

