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
            System.out.println("error has occurred ");
        }






    }
}
