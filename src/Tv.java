import java.util.Arrays;

public class Tv {
    String color;
    int channel;
    boolean power;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }


    public static void main(String[] args) {

        Tv t = new  Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("current channel is " + t.channel + " .");

        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("currant channel for t1 is " + t1.channel + " .");
        System.out.println("currant channel for t2 is  " + t2.channel + " .");

        t1.channel = 7;
        System.out.println("change the t1 channel to 7");
        System.out.println("t1 channel : " + t1.channel);
        t2 = t1 ;
        System.out.println("channel for t1 : " + t1.channel);
        System.out.println("channel for t2 : " + t2.channel);




    }

}
