package StaticMethod_InstanceMethod;

public class MyMath2 {
    long a; // instance variable
    long b; // instance variable


    long add(){
        return a+b ; // instance variable a, b
    }
    static long add1(long a , long b){ // local variable
        return a+b ; //local variable
    }




}
