public class Q11Fraction {
    // GDC (FPB)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // simplify a fraction by dividing by GDC (FPB)
    private static int[] simplify(int numerator, int denominator) {
        int gcdValue = gcd(numerator, denominator);
        return new int[] { numerator / gcdValue, denominator / gcdValue };
    }

    public static void fractionSum(int e1, int d1, int e2, int d2) {
        int ds = d1 * d2;
        int es = e1 * d2 + e2 * d1;

        int[] simplified = simplify(es, ds);
        System.out.println("Sum: " + simplified[0] + "/" + simplified[1]);
    }

    public static void fractionProduct(int e1, int d1, int e2, int d2) {
        int dp = d1 * d2;
        int ep = e1 * e2;

        int[] simplified = simplify(ep, dp);
        System.out.println("Product: " + simplified[0] + "/" + simplified[1]);
    }

    public static void main(String[] args) {
        fractionSum(1, 2, 1, 3); // 1/2 + 1/3
        fractionSum(1, 3, 3, 4); // 1/3 + 3/4

        fractionProduct(1, 2, 2, 3); // 1/2 * 2/3
        fractionProduct(1, 4, 2, 3); // 1/4 * 2/3
    }
}
