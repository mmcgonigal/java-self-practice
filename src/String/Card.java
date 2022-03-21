package String;

import java.util.Objects;

public class Card {
    String kind;
    int number;

    Card (String kind, int number){
        this.kind = kind ;
        this.number = number;
    }

    Card() {
        this("Spade",1);
    }

//     toString() from Object Class overriding.
    public String toString(){
        return "kind : " + kind + " , number : " +number ;
    }

   //IF OVERRIDING equals(), MUST OVERRIDING hashcode() as well.
    public boolean equals(Object obj){
        if(!(obj instanceof Card))
            return false;

        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number == c.number ;
    }

    public int hashcode(){
        return  Objects.hash(kind,number);
    }

    public static void main(String[] args) {
        System.out.println(new Card().toString());  // before overriding toString () : nameOfClass@hashcode()
        System.out.println(new Card().toString());  //  before overriding toString () : nameOfClass@hashcode()
        // kind : Spade, number : 1






    }
}
