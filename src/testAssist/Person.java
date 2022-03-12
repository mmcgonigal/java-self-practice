package testAssist;

public class Person {
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
public static void main(String[] args) {
    String[] names = {"Rick", "Stacey", "Brad", "Becca"};
    String x;
    try {
        x = names[100];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception caught!");
        x = "";
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        System.out.println("This will always run.");
    }
}
}
