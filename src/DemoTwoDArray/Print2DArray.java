package DemoTwoDArray;

public class Print2DArray {
    public static void main(String[] args) {
        int matrix[][]=new int[2][2];

        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[1][0]=3;
        matrix[1][1]=4 ;
    print2D(matrix);



    String[][] w1= {{"Mr","McDonald"},{"ms","polly"}};

    }

    static void print2D(int arr[][]){
        for(int i=0;i<arr.length;i++)
            for (int j=0;j<arr.length;j++)
                System.out.println(arr[i][j]);
    }
}
