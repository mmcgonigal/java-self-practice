package String;
import java.util.ArrayList;
public class Equals {
//    hashcode()   --> return hashcode of the instances.

    public static void main(String[] args) {
        String str1 = new String ("abc");
        String str2 = new String("abc");
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());



        ArrayList<String> favFoods = new ArrayList<>();
        favFoods.add("sushi");
        favFoods.add("enchiladas verdes");
        favFoods.add("chicken tikka masala");

        System.out.println("favfoods = " + favFoods);

        ArrayList<String> favFoods2 = new ArrayList<>();

        favFoods2 = favFoods; //Copied the whole object + ref over

        System.out.println("favFoods2.hashCode() = " + favFoods2.hashCode());
        System.out.println("favfoods.hashCode() = " + favFoods.hashCode());

        System.out.println("favFoods == favFoods2 = " + (favFoods == favFoods2));


        favFoods2 = new ArrayList<>();
        for (String food : favFoods){
            favFoods2.add(food);
        }
        System.out.println("(favFoods == favFoods2) = " + (favFoods == favFoods2));

        for(String food : favFoods){
            if(food.equalsIgnoreCase( "enchiladas verdes")){
                System.out.println(food + "? I love some mexican food");
            } else {
                System.out.println(food + " is pretty good too");
            }
        }

    }







}
