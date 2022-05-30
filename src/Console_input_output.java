import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

;
public class Console_input_output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any integer");
        int i = sc.nextInt();
        System.out.println("the integer entered is  " + i);

        File file = new File("input.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextInt()) {
                System.out.println(scan.nextInt() * 100);
            }
        } catch (FileNotFoundException e) {
            System.out.println("error has occurred");
        }

//      TODO  Task
//        Given an integer, , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
//
//        Complete the stub code provided in your editor to print whether or not  is weird.
//        HackerRank
        int N= sc.nextInt();
        if(N%2 == 0 && 2<=N && N <= 5){
            System.out.println("not weird");
        }else if (N %2 == 0 && 6<=N && N <= 20){
            System.out.println("weird");
        }else if (N %2 == 0 && 20<=N){
            System.out.println("not weird");
        }else{
            System.out.println("weird");
        }









    }
}
