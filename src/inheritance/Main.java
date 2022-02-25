package inheritance;
import java.util.Scanner;

public class Main {

    public static void main (String[] args ){

        Student student1 = new Student("jane",30,165,165,"asd12df",3,4.3);
        student1.show();
        Teacher teacher1 = new Teacher("john", 50,180,180,"askhadf133",80000,10);
        teacher1.show();

        Student[] students = new Student[100];
        for(int i = 0; i< 100; i++){
            students[i] = new Student("jane doe",20,165,165,i+" ",1,4.5);
            students[i].show();
        }

        Scanner scanner = new Scanner (System.in);
        System.out.println("how many students in a class 1?");
        int number = scanner.nextInt();
        Student[] class1 = new Student[number];
        for (int i =0 ; i < number; i ++){
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
            System.out.println("name of student");
            name = scanner.next();
            System.out.println("age of a student?");
            age = scanner.nextInt();
            System.out.println("student height?");
            height = scanner.nextInt();
            System.out.println("student weight?");
            weight = scanner.nextInt();
            System.out.println("student ID ? ");
            studentID = scanner.next();
            System.out.println("student grade ? ");
            grade = scanner.nextInt();
            System.out.println("student GPA ?");
            GPA = scanner.nextDouble();

            class1[i] = new Student(name,age,height,weight,studentID,grade,GPA);
        }
        for(int i = 0 ; i < number; i++ ){
            class1[i].show();
        }



    }
}
