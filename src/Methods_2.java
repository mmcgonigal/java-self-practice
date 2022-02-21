public class Methods_2 {

   //factorial example :  5! = 5 * 4 * 3 * 2 * 1
    public static int factorialWhile (int number){
        int k = 1; int sum = 1;
        while( k <= number){
            sum *=k;
            k++;
        }
        return sum;
    }

    public static int factorialFor(int number){
        int sum = 1;
        for(int i = 1; i <= number; i ++){
            sum*=i;
        }
        return sum;
    }

    public static int factorialRecursion(int number){
        if(number == 1){
            return 1;
        }else{
            return number * factorialRecursion(number - 1);
        }
    }














    public static void main(String[] args){
        System.out.println(factorialWhile(5));
        System.out.println(factorialFor(5));
        System.out.println(factorialRecursion(5));

    }
}
