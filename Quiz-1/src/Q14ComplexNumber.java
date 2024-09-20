public class Q14ComplexNumber {
    private int realPart;
    private int imaginary;

    public Q14ComplexNumber(int  realPart, int imaginary){
        this.realPart = realPart;
        this.imaginary = imaginary;
    }

    public int getRealPart() {
        return  realPart;
    }

    public int getImaginaryPart() {
        return  imaginary;
    }

    //Additions = (a + bi) + (c + di) = (a + c) + (b + d)i
    public Q14ComplexNumber add(Q14ComplexNumber other) {
        int realSum = this.realPart + other.realPart;
        int imaginarySum = this.imaginary + other.imaginary;
        return new Q14ComplexNumber(realSum, imaginarySum);
    }

    //Subtractions = (a + bi) - (c + di) = (a - c) + (b - d)i
    public Q14ComplexNumber subtract(Q14ComplexNumber other) {
        int realDiff = this.realPart - other.realPart;
        int imaginaryDiff = this.imaginary - other.imaginary;
        return new Q14ComplexNumber(realDiff, imaginaryDiff);
    }

    //Multiplications = (a + bi) * (c + di) = (a * c - b * d) + (a * d + b * c)i
    public Q14ComplexNumber multiply(Q14ComplexNumber other) {
        int realProduct = (this.realPart * other.realPart) - (this.imaginary * other.imaginary);
        int imaginaryProduct = (this.realPart * other.imaginary) + (this.imaginary * other.realPart);
        return new Q14ComplexNumber(realProduct, imaginaryProduct);
    }

    public String toString() {
        return realPart + " + " + imaginary + "i";
    }
}
