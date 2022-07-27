package Conditional;

import java.util.Scanner;

public class ConditionalFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("hello");
        }


        for(int i =0; i <= 10; i++){
            System.out.println("i = " + i);
        }


        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i ;
            System.out.print(sum);
        }

        for(int i =2; i<= 9;i++){
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+" * " + j + " = " +(i*j));
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("**********");
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int k = 5;
        while (k != 0) {
            k--;
            System.out.println(k +" I can do it!");
        }

        int total = 0;
        int j = 0;
        while (total <= 100) {
            System.out.println( j + " - " + total);
            total += ++j;
        }

        System.out.println("Please type number , (ex:12345)");
        Scanner scanner = new Scanner(System.in);

        // remainder of 10   will be the last digit.
        int added = 0;
        for (int number = scanner.nextInt(); number > 0; number = number / 10) {
            System.out.println(number%10);
            added += number %10 ;
            System.out.println("added = " + added + " , number %10 = " + number%10);
        }
        System.out.println("added is " + added);

//        int number = scanner.nextInt();
//        while (number >0){
//            sum += number%10;
//            System.out.println("sum " + sum + " ,number % 10 = " + number%10);
//            number = number /10;
//        }
//        System.out.println("sum of each digit = " + sum );

    }

}
