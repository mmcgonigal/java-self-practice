package String;

public class Equals {
//    hashcode()   --> return hashcode of the instances.

    public static void main(String[] args) {
        String str1 = new String ("abc");
        String str2 = new String("abc");
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());



    }
}
