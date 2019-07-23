package Lab;

public class Main {

    public static void main(String[] args) {
	 Matrix matrix = new Matrix("1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0", 4);
	 matrix.ToString();
        System.out.println(matrix.Calc());
    }

}
