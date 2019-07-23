package Lab;

public class MatrixSizeException extends Exception {
     MatrixSizeException(String str) {
        super("Matrix Size Exception: " + str);
    }
}
