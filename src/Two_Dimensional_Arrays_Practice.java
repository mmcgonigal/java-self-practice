import java.util.Arrays;

public class Two_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40}
        };
        int sum = 0 ;
        for( int i = 0 ; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){

                System.out.printf("score[%d][%d] = %d%n",i,j,score[i][j]);

                sum += score[i][j];
            }
        }
        System.out.println("Sum of score is " + sum);

        //TODO get each student's sum of grade and average of the grade.

        int [][] grade = {
                {100,80,95},
                {20,100,37},
                {30,43,100},
                {80,70,100}
        };
        System.out.println("English Math Science");
        System.out.println("--------------------");
        System.out.println(Arrays.deepToString(grade));
        for( int i = 0 ; i < grade.length; i ++){
            int total = 0;
            float average = 0;

            for (int j = 0; j< grade[i].length; j++){
                sum += grade[i][j];
                System.out.println(sum);
            }
            average = sum/(float)grade[i].length;
            System.out.println(average);
        }



    }
}
