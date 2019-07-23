package Lab;

public class MatrixElementException extends Exception {
    MatrixElementException(String str) {
        super("Matrix Element Exception: " + str);
    }
}
