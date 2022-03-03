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


    }

}
