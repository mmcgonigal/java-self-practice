package OOP_Incorporate;

public class Main {
    public static void main(String[] args) {


        Hero[] heroes = new Hero[3];

        heroes[0] = new Warrior("warrior");
        heroes[1] = new Archer("archer");
        heroes[2] = new Wizard("Dumbeldore");

        for(int i = 0 ; i < heroes.length; i ++){
            heroes[i].attack();

            if(heroes[i]  instanceof Warrior){
                Warrior temp = (Warrior)heroes[i];
                temp.swordStrike();
            }else if (heroes[i] instanceof Archer){
                Archer temp = (Archer)heroes[i];
                temp.arrowValley();
            }else if  (heroes[i] instanceof Wizard){
                Wizard temp = (Wizard)heroes[i];
                temp.castingMagic();
            }
        }


    }

}
