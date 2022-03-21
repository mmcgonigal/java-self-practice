package String;

public class Person {
    long id;

    public boolean equals(Object obj){
        if(!(obj instanceof Person))
            return false;

            Person p = (Person)obj;
            return this.id == p.id;
        }

    Person (long id){
        this.id = id;

    }

    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(true)
            System.out.println(" p1 and p 2 are same person");
        else
            System.out.println(" p1 and p2 are different person");


    }




}


