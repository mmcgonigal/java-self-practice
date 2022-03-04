package inheritance;

public class SmartTv extends Tv{
    boolean caption;

    void displayCaption(String text){
        if (caption){
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        SmartTv smtv = new SmartTv();
        smtv.channel = 10; // iv from parent class
        smtv.channelUp(); // iv from parent class
        smtv.channelDown();
        smtv.displayCaption("hello world");



    }


}


