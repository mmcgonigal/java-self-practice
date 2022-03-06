package Interface;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter ();
        f.move (100,200);
        f.attack(new Fighter());

        //SAME AS //
        Fighter f2 = new Fighter();
        f.attack(f2);

        // WE CAN ALSO DO
        Unit f3 =new Fighter();
        f3.move(300,400);
        //BUT CAN"T DO
        //f3.attack(f2);   ---> Unit doesn't have attack member in the field
        f3.stop();

        //WE CAN ALSO DO

        Fightable f4 = new Fighter();
        f4.move(200,500);
        f4.attack(f);
        f4.attack(f2);
        // f4.stop(); Fightable does not have stop() so not able to call it.










    }
}
