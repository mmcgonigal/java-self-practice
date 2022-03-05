package Polimorphism_Practice;

public class Product2 {
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
