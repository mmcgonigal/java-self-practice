package StaticMethod_InstanceMethod;

public class MyMath2 {
    long a; // instance variable   : this.a
    long b; // instance variable   : this.b

    MyMath2( long a, long b){
        this.a = a;
        this.b = b;
    }


    long add(){
        return a+b ; // instance variable a, b
    }
    static long add1(long a , long b){ // local variable
        return a+b ; //local variable
    }




}
