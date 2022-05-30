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

    //fibonacci  0,1,1,2,3,5,8,13,21.....

    public static int fibonacci(int number){
        int previousValue = 1;
        int currentValue = 1;
        int result = -1;
        if(number == 1){
            return previousValue;
        }else if(number == 2){
            return currentValue;
        }else{
            for(int i = 2; i < number ; i++){
                result = previousValue + currentValue;
                previousValue = currentValue;
                currentValue = result ;
            }
        }
        return result ;
//
//        if( number == 1){
//            return 1;
//        }else if (number == 2){
//            return 1;
//        }else{
//            return fibonacci(number -1) + fibonacci(number -2);
//        }
    }





    public static void main(String[] args){
        System.out.println(factorialWhile(5));
        System.out.println(factorialFor(5));
        System.out.println(factorialRecursion(5));
        System.out.println("fibonacci's 5 th element is : " +  fibonacci(5));
        System.out.println();



    }
}
