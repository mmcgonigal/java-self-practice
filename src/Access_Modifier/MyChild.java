package Access_Modifier;

public class MyChild extends MyParent{
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv);
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }
}
