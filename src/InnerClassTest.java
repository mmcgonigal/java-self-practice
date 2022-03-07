class AAA {  /// AAA became outter class of BBB
    int i = 100 ;
    BBB b = new BBB();

    class BBB{  // BBB became inner class of AAA
        void method(){
//            AAA a = new AAA();
            System.out.println(i);

            System.out.println( i); // without create instance, i can still access to outter class members.

        }
    }
        }


class CCC{
//    BBB b = new BBB(); // Since class BBB is inner case of AAA . class CCC can't access to BBB anymore
}

public class InnerClassTest {

    public static void main(String [] arg){
//        BBB b = new BBB();
//        b.method();
    }
}
