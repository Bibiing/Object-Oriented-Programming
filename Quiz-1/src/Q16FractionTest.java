public class Q16FractionTest {
    // Main method to test the class
    public static void main(String[] args) {
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);

        System.out.println(f1.toString());             // prints "1/2"
        System.out.println(f2.getProduct(f1));         // prints "3/14"
        System.out.println(f2.getSum(f1));             // prints "13/14"
    }
}
