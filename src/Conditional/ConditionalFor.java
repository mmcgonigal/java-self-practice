package Conditional;

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

    }

}
