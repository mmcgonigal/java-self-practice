package OOP_Incorporate;

public class Wizard extends Hero{
    public Wizard (String name ){
        super(name);
    }
    public void castingMagic(){
        System.out.println("abracadabra");
    }
    public void attack(){
        System.out.println("hitting with staff!");
    }
}
