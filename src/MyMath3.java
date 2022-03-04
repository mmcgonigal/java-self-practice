public class MyMath3 {
    long add(int a, long b){
        System.out.println("long add(int a , long b) - ");
        return a+b;
    }
    long add(long a,int b){
        System.out.println("long add (long a, int b) - ");
        return a +b ;
    }


    public static void main(String[] args) {
        MyMath3 mm= new MyMath3();
        //System.out.println("mm.add(3,3) result : " + mm.add(3,3)); // ambiguous
        System.out.println("mm.add(3,3L) result : " + mm.add(3,3L));
        System.out.println("mm.add(3L,3) result : " + mm.add(3L,3));
      //  System.out.println("mm.add(3L,3L) result : " + mm.add(3L,3L)); //error , not available method , overloading error


    }
}
