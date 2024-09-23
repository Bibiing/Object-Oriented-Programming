public class Q16Fraction {
    private int numerator;
    private int denominator;

    // Constructor
    public Q16Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();  // Simplify the fraction after initialization
    }

    // Getter methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }



    public String toString() {
        if (this.denominator == 1) {
            return Integer.toString(this.numerator);  // If denominator is 1, return only the numerator
        } else {
            return this.numerator + "/" + this.denominator;  // Otherwise, return numerator/denominator
        }
    }

    // Method to compute the sum of two fractions
    public Q16Fraction getSum(Q16Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        return new Q16Fraction(newNumerator, commonDenominator);
    }

    // Method to compute the product of two fractions
    public Q16Fraction getProduct(Q16Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Q16Fraction(newNumerator, newDenominator);
    }

    // Simplify the fraction using the greatest common divisor (GCD)
    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        // Ensure that the denominator is positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Helper method to calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
