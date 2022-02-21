public class Operator {
    final static int SECOND = 1000;

    public static void main(String[] args) {

        int minute = SECOND / 60;
        int second = SECOND % 60;

        System.out.println(minute + " minute " + second + " second" );

        int a = 10;
        System.out.println( "currant a is " + a); //10
        a++;
        System.out.println("currant a is " + a++); //11
        System.out.println("currant a is " + a); //12

        System.out.println("currant a is " + ++a); //13
        System.out.println("currant a is " + a); //13

        System.out.println(1 % 3);//1
        System.out.println(2 % 3);//2
        System.out.println(3 % 3);//0
        System.out.println(4 % 3);//1
        System.out.println(5 % 3);//2
        System.out.println(6 % 3);//0

        int b = 50;
        int c = 50;

        System.out.println(" is b equal to c ? : " + (b == c));  //true
        System.out.println(" is b greater than c ? : " + (b > c)); //false
        System.out.println("is b equal to c and is b greater than 30 ? : " + (( b == c) && ( b > 30))); //true
        System.out.println("is b equal to c and is b greater than c ? : " + (( b == c) && ( b > c))); //false
        System.out.println(" is b not 50? : " + !(b == 50));// false

        int x = 50;
        int y = 60;
        System.out.println("max value is  " + max(x,y) + " . ");

        double k = Math.pow(3.0 , 20.0); // 3 to the power of 20. : 3의 20승  ;; // 2147483647
        System.out.println( "3.0 to the power of 20.0 equals : " + (int)k);









    }


    static int max(int a , int b){
        int result = (a > b) ?  a : b; // (condition) ? if true : else
        return result;
    }
}
