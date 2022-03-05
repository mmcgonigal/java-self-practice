package Abstract;

import Polimorphism_Practice.Audio;

public class PlayerTest  {

    public static void main(String[] args) {
        //    Player p = new Player();  // this will cause error because Player class is abstract, --> cannot create instance.
        AudioPlayer ap = new AudioPlayer(); // or
         // Player ap = new AudioPlayer();  // O.K.
        ap.play(100);
        ap.stop();


    }
}
