package Polimorphism_Practice;

public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("not enough balance to purchase an item");
            return;
        }
        money -=p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(" you have purchased p : ---> "  + p.toString());
    }

    void summary () {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++){
            if(cart[i] == null)
                break;
            sum += cart[i].price;
            itemList += cart[i] + ", " ;
        }
        System.out.println("Total amount spent is : ---> " + sum);
        System.out.println("Items you purchased are : ---> " +itemList);


    }

    public static void main(String[] args) {
        Buyer2 b2 = new Buyer2();
        b2.buy(new Tv2());
        b2.buy(new Computer2());
        b2.buy(new Audio2());

        b2.summary();

    }



}
