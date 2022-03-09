package Object;

public class main {

    public static void main(String[] args) {

        Archer archer1 = new Archer ("archer1","super");
        Archer archer2 = new Archer ("archer1","super");
        System.out.println(archer1 == archer2); // becasue they are 2 different instances
        System.out.println(archer1.equals(archer2)); // equals() is asking if the value is same , which they are same name and same power so true!

    }
}
