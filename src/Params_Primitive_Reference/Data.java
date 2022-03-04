package Params_Primitive_Reference;

public class Data {
    int x ;

    static void change (int x ){
        x = 1000;
        System.out.println("change() : x = " + x);
    }
    static void change2 (Data a){
        a.x = 1000;
        System.out.println("change2() : x = " + a.x);
    }


    public static void main(String[] args) {

        Data d = new Data(); // instance of d
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        change(d.x);
        System.out.println("After calling method---> change(d.x) primitive param !! only readable");
        System.out.println("main() : x  = " + d.x); // because  change() 's parameter is primitive data type, it wont change/ effect the result


        Data d2 = new Data();
        d2.x = 10;
        System.out.println("main() : x  = " + d2.x);
        change2(d2);
        System.out.println("After calling method---> change(d2) : reference param!! read.writeable   ");
        System.out.println("main() : x = " + d2.x);




    }

}
