import java.util.Arrays;
public class Array_Practice {
    public static void main(String[] args) {
        int[] score ; //  declaring array name score
        score = new int[5]; // created the array, ( length of 5)

       // int[] score = new int[5] ; // declare and  create at the  same time.
        score[3] = 100;
        System.out.println("score 3 is : " + score[3]);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println(" arr["+i+"] = " + arr[i]);
        }

        // initializing  - save values in each element.
        int[] point = {50,60,70,80,90};
        //int[] score = new int[]{50,60,70,80,90};

        //print out array
        int[] iArr = {100,95,80,70,60};
        //System.out.println(iArr); this wont work, this will be result of [I@xxxxx] type of result , I means int, @ meanst where it is located and stored.
        //EXCEPTION **
        char[] chArr = {'a','b','c','d','e'};
        System.out.println(chArr); // a b c d e will be printed out < only char type array >
        System.out.println(Arrays.toString(iArr));;

        int sum = 0;
        float average = 0f;
        int [] grade  = {100,88,100,100,90};
        for(int i = 0; i < grade.length ; i++){
            sum+= grade[i];
        }
        average = (float) sum/grade.length;
        System.out.println(average );


        int [] number = {79,88,91,33,100,51,55,95};
        int max = number[0];
        int min = number[0];
        for(int i = 1 ; i < number.length; i++){
            max = number[i];
            if(number[i] > max){
                max = number[i];
            }else if (number[i] < min){
                min = number[i];
            }
        }
        System.out.println("the greatest element in number array is  " + max);
        System.out.println("the smallest element in number array is " + min);


        //shuffle
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));
        for (int i =  0; i < 100 ; i ++){
            int n = (int)(Math.random()*10);
            int temp =  numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }
        System.out.println(Arrays.toString(numArr ));
        String [] stArr = {"rock","paper","scissors"};
        System.out.println(Arrays.toString(stArr));




    }

}
