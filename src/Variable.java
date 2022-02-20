public class Variable {

    final static double PI = 3.141592;  //constant comes above main, non mutable.
    final static int INT_MAX = 2147483647;


    public static void main(String[] args) {

        int intType = 100 ; //integer
        double doubleType = 150.5;
        String stringType = "mina";

        int r = 30;

        System.out.println(intType); // println : print line change
        System.out.println(doubleType);
        System.out.println(stringType);
        System.out.println(r * r * PI);
        int a =  INT_MAX;
        System.out.println(a + 1); // -2147483648 --> overflow  because int's  max number = 2147483647

        int b = 1;
        int c = 2;
        System.out.println("b + c= "  + ( b + c));
        System.out.println("b - c= "  + ( b - c));
        System.out.println("b * c= "  + ( b * c));
        System.out.println("b / c= "  + ( b / c));






    }
}
