package Abstract_Classes_Practice;

public class Main extends Player {

    public static void main(String[] args) {

        Main main = new Main ();
        main.play("abc - alphabet song");
        main.pause();
        main.stop();


    }

    @Override
    void play(String songName) {
        System.out.println(songName +  " playing ");

    }

    @Override
    void pause() {
        System.out.println(" pause ");

    }

    @Override
    void stop() {
        System.out.println(" stop   ");

    }
}
