package Lab;

import java.util.Arrays;

public class Matrix {
    private String[][] array;
    private int rank;

    Matrix(String str, int rank) {
        this.rank = rank;
        try {
            converToArray(str, rank);
        } catch (MatrixSizeException e) {
            e.printStackTrace();
        }
        catch (MatrixElementException e) {
            e.printStackTrace();
        }
    }

    private void converToArray(String srt, int count) throws MatrixSizeException,MatrixElementException {
        if (count!=4){
           throw new MatrixSizeException("Проверьте размер матрицы");
        }
        srt = srt.replaceAll("\\s+", "");
        array = new String[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (srt.charAt(i * count + j) < '0' || srt.charAt(i * count + j) > '9') {
                    throw new MatrixElementException("Элемент матрицы не число");
                }
                array[i][j] = String.valueOf(srt.charAt(i * count + j));
            }
        }

    }

    public void ToString() {
        for (int i = 0; i < rank; i++) {
            for (int j = 0; j < rank; j++) {

                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
public float Calc(){
      int sum = 0;
    for (int i = 0; i < rank; i++) {
        for (int j = 0; j < rank; j++) {
        sum+= Integer.parseInt(array[i][j]);
        }
    }
    return sum/2.0f;
}
}
