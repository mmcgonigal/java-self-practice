package String;

public class Value {
    int value;

    Value(int value){
        this.value = value;
    }
    public boolean equals(Object obj){
        return (this == obj);
    }

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);


        //BEFORE equals() OVERRIDING
        System.out.println("v1.equals(v2) = " + v1.equals(v2));  //false

        if(v1.equals(v2))
            System.out.println("v1 and v2 are same");
        else
            System.out.println("v1 and v2 are different");




    }


}
