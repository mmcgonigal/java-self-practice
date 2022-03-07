public class Outer {
    int value = 10;

    class Inner{
        int value = 20 ;
        void method (){
            int value = 30;
            System.out.println("           value :"  + value); //30 local value in the method
            System.out.println("     this.value  :"  + this.value ); // this. will distinguis instance variable and local variable.--> 20
            System.out.println("Outer.this.value :"  +Outer.this.value ); // 10
        }
    } // Inner class closure
} // outer class closure
