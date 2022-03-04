package Access_Modifier;

public class TimeTest {
    public static void main(String[] args) {

//        Time t = new Time();
//        t.hour = -100;
//        System.out.println(t.hour);
        // Time instance variables are accessible because they are default .

        // now im going to change instance variable tp private .
//
//        Time t = new Time();
//        t.hour = -100;
//        System.out.println(t.hour);  // error ::  hour has private access modifier .

       Time t = new Time();
       t.setHour(5);
        System.out.println(t.getHour());

    }



}



