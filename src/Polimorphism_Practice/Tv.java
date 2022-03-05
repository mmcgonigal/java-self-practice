package Polimorphism_Practice;

public class Tv extends Product{
    Tv(){
        // calling Product(int price) constructor.
        super(100); // Tv price is 100
    }

    //overriding toString() in Object class (super of Product class)
    public String toString(){
        return "TV";
    }


}
