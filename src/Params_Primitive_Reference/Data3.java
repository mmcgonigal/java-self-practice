package Params_Primitive_Reference;

public class Data3 {
    int x;

    static Data3 copy(Data3 a) {
        Data3 temp = new Data3();
        temp.x = a.x;
        return temp;

    }


    public static void main(String[] args) {
        Data3 data = new Data3();
        data.x = 10;

        Data3 data2 = copy(data);
        System.out.println("data.x = " + data.x); //10
        System.out.println("data2.x = " + data2.x); //10


    }
}
