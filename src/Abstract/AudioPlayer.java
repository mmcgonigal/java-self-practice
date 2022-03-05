package Abstract;

public class AudioPlayer extends Player{
    void play(int pos){
        System.out.println("play start from " + pos  );
    }
    void stop(){
        System.out.println(" Pause ");
    }
}
