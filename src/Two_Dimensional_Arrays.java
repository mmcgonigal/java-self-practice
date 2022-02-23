public class Two_Dimensional_Arrays {

    //a[0][0],a[0][1]   a[row][column]
    public static void main(String[] args) {
        int N = 50;
        int[][] array = new int[N][N];
        for(int i = 0; i <N ; i++){    //[i][j]
            for(int j = 0; j < N; j ++){
                array[i][j] = (int)(Math.random() * 10); // random number between 0-9 will be filled
            }
        }
        for(int i = 0; i < N ; i ++){
            for(int j = 0 ; j < N ; j++){
                System.out.print(array[i][j] + " " );
                // each index is shown : start from array[0][0] array[0][1] .....array [0][49]
                //then it goes to array[1][0] array[1][1] ....array [1][49]... until array [49][49]
            }
            System.out.println();
        }

    }
}
