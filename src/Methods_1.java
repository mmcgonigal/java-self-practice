public class Methods_1 {

    public static int function(int a, int b, int c){
        int min;
        if( a > b) {
            if (b > c) {
                min = c;
            } else {
                min = b;
            }
        }else {
            if( a > c){
                min = c;
            }else{
                min = a;
            }
        }
        for (int i = min; i > 0; i--){
            if( a % i == 0  && b % i == 0 && c % i ==0 ){
                return i
;            }
        }


        return -1;
    }

    public static int findKthDivisor(int number, int k){
        for( int i  = 1;  i <= number; i++){
            if(number % i == 0){
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static char lastChar(String input){
        return input.charAt(input.length() - 1 );
    }

    public static int max( int a, int b){
        return(a > b) ? a : b;
    }
    public static int maxNum(int a, int b, int c){
        int result = max( a , b);
        result = max(result, c);
        return result;
    }




    public static void main (String[] args){

        System.out.println("The greatest common factor of 400, 300, 750 = " + function(400,300,750));

        int result = findKthDivisor(3050, 10);
        if (result == -1){
            System.out.println("3050 does not have 10th divisor");
        }else{
            System.out.println("3050's 10th divisor = " + result);
        }

        System.out.println(" 'Hello world's  last letter is :  " + lastChar("Hello world") );

        System.out.println( " the biggest number among (345, 234, 567) is : " + maxNum(345, 234,567));




    }
}
