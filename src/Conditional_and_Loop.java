public class Conditional_and_Loop {

    final static int N = 30;
    final static int o = 15;
    public static void main(String[] args){
        int i = 20;
        i = i +1; // i+=1 ;
        System.out.println(i);
        System.out.println((100 < i) && (i < 200)); //false
        System.out.println((100 < i) || (i < 200)); //true

        String a  = " I love you" ;
        if (a.contains("love")){
            System.out.println("I love you too");
        }else{
            System.out.println("I dont love you");
        }

        int score = 95;
        if(score >= 90){
            System.out.println("A+");
        }else if(score >= 80){
            System.out.println("B+");
        }else if (score >= 70){
            System.out.println("C+");
        }else{
            System.out.println("F");
        }

        String  animal = "bunny";
        int q =  0;

        if (animal.equals("bunny")){
            System.out.println("it is a bunny");
        }else{
            System.out.println("it is not a bunny");
        }

        if(q == 3){
            System.out.println("q is 3");
        }else{
            System.out.println("q is not 3");
        }

        if((animal.equalsIgnoreCase("bunny")) && q == 0){
            System.out.println("this is true");
        }else{
            System.out.println("it is false");
        }

        int k = 1 , sum = 0;
        while ( k <= 1000){
            sum += k++;  // 1+2+3+ .... +999+1000
        }
        System.out.println(" sum of 1 to 1000 is = " + sum);

        for( int n = N; n > 0; n--){
            System.out.println("*");
        }

        for (int s = N; s > 0 ; s--){
            for(int h = s; h > 0; h--){
                System.out.print("*");
            }
            System.out.println();
        }

        //x^2 + y^2 = r^2

        for (int x = -o; x <= o; x++ ){
            for(int y = -o; y <= o; y++){
                if (x * x + y * y <= o * o){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int count = 0;
        for( ;;){
            System.out.println("print");
            count++;
            if(count ==10){
                break;
            }
        }

        for(int c = 0; c <= 10; c++){
            for(int b = 0; b <= 10; b++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int z = 0; z <= 10; z++){
            for(int w = 0; w<z; w++){
                System.out.print("*");
            }
            System.out.println(" ");
        }










    }
}
