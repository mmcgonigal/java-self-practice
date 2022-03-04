package Access_Modifier;

public class MyParentTest {

    public static void main(String[] args) {
        MyParent p = new MyParent();
        //  System.out.println(p.prv); // error   ---> out of its private range :: MyParents
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }
}
