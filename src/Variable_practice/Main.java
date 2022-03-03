package Variable_practice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Card.width =  " + Card.width);
        System.out.println("Card.height =  " + Card.height);

        Card c1 = new Card();
        c1.number = 7;
        c1.shape = "Heart";

        Card c2 = new Card();
        c2.number = 4;
        c2.shape = "Spade";

        System.out.println("c1 is " +c1.number +" "+ c1.shape + " card ." );
        System.out.println("c1 is " +c2.number +" "+ c2.shape + " card ." );

        c1.width = 50; //  Card.width  = 50 ; is preferred .
        c1.height = 80; // Card.height = 80 ; is preferred .

        // Class variable  -- > will affect all of instances .

        System.out.println("c1 is " +c1.number +" "+ c1.shape + " card and width is " + c1.width + "and height is " + c1.height );
        System.out.println("c1 is " +c2.number +" "+ c2.shape + " card and width is " + c2.width + "and height is " + c2.height );





    }
}
