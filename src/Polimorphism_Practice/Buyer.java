package Polimorphism_Practice;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println(" not enough money to buy the item");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You just purchased " +  p);  // p---> p.toString()
        System.out.println("you just purchased " + p.toString()); // same result .

    }


    public static void main(String[] args) {

        Buyer b = new Buyer();

//        Product p = new Tv();
//        b.buy(p);

        b.buy(new Tv());  // buy(product p)
        b.buy(new Computer());//buy(product p )

        System.out.println("Current remaining balance is " + b.money);
        System.out.println("Current bonus point is " + b.bonusPoint);



    }


}
