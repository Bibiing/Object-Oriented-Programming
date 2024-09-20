public class Q14ComplexNumberTest {

    /**
     * This class tests the Q14ComplexNumber class.
     * It creates instances of Q14ComplexNumber and tests all the methods, including
     * addition, subtraction, multiplication, and string conversion.
     */

    public static void main(String[] args) {
        Q14ComplexNumber complex1 = new Q14ComplexNumber(3, 4); // 3 + 4i
        Q14ComplexNumber complex2 = new Q14ComplexNumber(1, 2); // 1 + 2i

        Q14ComplexNumber sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        Q14ComplexNumber difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference);

        Q14ComplexNumber product = complex1.multiply(complex2);
        System.out.println("Product: " + product);

        System.out.println("Complex1: " + complex1);
        System.out.println("Complex2: " + complex2);
    }
}
