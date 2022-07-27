package Conditional;

import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {

        int input = 0, answer = 0;
        answer = (int)(Math.random()*100) + 1 ;  // 1 <= answer <=100
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("please type a number between 1 and 100");
            input = scanner.nextInt();
            if (input > answer) {
                System.out.println("smaller number please");
            }else if (input < answer) {
                    System.out.println("bigger number please");
            }

        }while(input != answer);
        System.out.println("You fount the number !!-------->" + answer);
    }

}
