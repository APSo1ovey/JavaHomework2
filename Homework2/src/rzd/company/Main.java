package rzd.company;
/*
Написать программу, которая вычисляет сумму двумерного массива по строкам*
Написать программу, которая вычисляет сумму двумерного массива по столбцам*
*/
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int matrix[][] = new int[5][5];

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i * j);
            }
        }

        int sumstr = 0;
        int sumstlb[] = new int[5];
        int count = 0;

        for(int[] item : matrix) {
            for(int a : item){
                sumstr += a;

                switch (count) {
                    case 0: sumstlb[0] += a;
                    break;
                    case 1: sumstlb[1] += a;
                    break;
                    case 2: sumstlb[2] += a;
                    break;
                    case 3: sumstlb[3] += a;
                    break;
                    case 4: sumstlb[4] += a;
                    break;
                }
                count++;
                }

            System.out.print(Arrays.toString(item) + "\t");
            System.out.print(sumstr);
            System.out.println();
            sumstr = 0;
            count = 0;
        }
        for (int item : sumstlb) {
            System.out.print(item + "\t");
        }

    }
}
    

