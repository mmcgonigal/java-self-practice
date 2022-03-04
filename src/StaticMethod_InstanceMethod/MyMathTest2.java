package StaticMethod_InstanceMethod;

public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add1(200L,300L)); // name of class where the method belongs to, //add1 is static method .

        MyMath2 mathTest = new MyMath2();
        mathTest.a  = 200L;
        mathTest.b = 400L;
        System.out.println(mathTest.add());



    }
}
