package Interface;

public class A {
    public void method (B b){
        //only  the ones implemented I
    }
    public void method (I i){
        i.method();
    }
}
