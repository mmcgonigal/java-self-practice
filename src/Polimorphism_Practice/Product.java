package Polimorphism_Practice;

public class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
          bonusPoint = (int)(price/10.0);
    }  //this is the super class constructor I set .

}
