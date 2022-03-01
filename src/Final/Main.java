package Final;

public class Main extends Parent{

    public void show(){
        System.out.println("hello"); // overriding
    }
//    public void display(){
//        System.out.println("adios"); // Parent class has "final " so overriding is not possible.
//    }

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
        main.display();
    }


}
