package Access_Modifier;

 class MyParent {
    private int prv ; // only same class accessible
    int dft ; // same package
    protected int prt; // same package and other child class from different package
    public int pub; // no access limit

     public void printMembers(){
         System.out.println(prv);
         System.out.println(dft);
         System.out.println(prt);
         System.out.println(pub);
     }
}

