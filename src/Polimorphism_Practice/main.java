
package Polimorphism_Practice;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Fruit fruit = new Peach();
        fruit.show();
        Fruit fruit2 = new Banana();
        fruit2.show();
        System.out.println(fruit2.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("banana : 1 , peach : 2");
        int input = scanner.nextInt();
        if(input == 1 ){
            fruit = new Banana();
            fruit.show();
        }else if (input == 2){
            fruit = new Peach();
            fruit.show();
        }


    }
}
