import java.util.Scanner;
public class Array {
    // how to create array ::
//    //int [] nameOfArray = new int[ sizeOfArray" length " ex) 100 ] ;
//    public static int max(int a , int b){
//        return (a > b) ? a : b ;
//    }
    //data type[] name of variable : int[] score; score = new int[5]; String[] name;

    //array
    //int[] name = new int[100];  -->0(start )~99(end)  1 array with 100 index length.
    public static int max (int a ,int b){
        return (a>b) ? a : b;
    }


    public static void main(String[] args) {


//        Scanner scanner  = new Scanner(System.in);
//        System.out.print("Please type in the length of Array you are going to crete");
//        int number = scanner.nextInt();
//        int [] arr = new int[ number ];
//        for( int i = 0  ; i < number ; i++){
//            System.out.println( " please type integer for each index ");
//            arr[i] = scanner.nextInt();
//        }
//        int result = -1; // so it can compare first index of array with it to make first index is the biggest on first loop
//        for(int i = 0 ; i < number ; i ++){
//            result = max(result,arr[i]);
//        }
//        System.out.println("the largest number is " + result + " .");

//        int [] newArray = new int[100];
//        for(int i = 0; i < 100; i++){
//            newArray[i] = (int)(Math.random() * 100 + 1) ;
//            // Math.random() creates random floats of 0.xx ~ 1  0 <= x < 1
//            // therefore, multiply 100 to make it 1 <= x <100
//            // then plus 1 ---> 1 <= x < 101
//        }
//        int sum = 0;
//        for( int i = 0; i < 100 ; i ++){
//            sum += newArray[i];
//        }
//        System.out.println("100s of random number's average is " + sum /100);


//        Scanner scan =  new Scanner(System.in);
//        System.out.println("please set a size of array ! ");
//        int number = scan.nextInt();
//        int[] array  = new int[number];
//        for (int i = 0; i <number ; i++){
//            System.out.print("please input integer for each index.");
//            array[i] = scan.nextInt();
//        }
//        int result = -1;
//        for (int i = 0; i< number ; i ++){
//            result = max(result,array[i]);
//        }
//        System.out.println("the largest number is " + result + " .");
////
        int[] arr = new int [100];
        for( int i = 0; i < 100 ; i ++){
            arr[i] = (int)(Math.random() *100 +1);
            System.out.println(arr[i]);
        }
        int sum = 0 ;
        for( int i = 0 ; i < 100; i ++){
            sum += arr[i];
        }
        System.out.println("100 random numbers' average is " + sum/100);







    }
}
