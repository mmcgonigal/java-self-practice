package Interface;

public class Fighter extends Unit implements Fightable{
    //it was public abstract void move () in Fightable, rule of overriding :: access Modifier should not be narrower than parent class !
    public void move(int x , int y){
        System.out.println(" move to ["+x+" , "+y+"]");
    }
   public void attack (Fightable  f){
        System.out.println("Attack " + f + " !");
    };

    Fightable getFighter(){
        Fighter f = new Fighter();
        return (Fightable)f;
    }

}
