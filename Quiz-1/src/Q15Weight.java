public class Q15Weight {
    /**
     * The Q15Weight class represents a weight given in pounds and provides
     * methods to return the weight in pounds and kilograms.
     */

    private double pounds;
    private static final double POUNDS_TO_KG = 0.45359237; // // Conversion factor from pounds to kilograms

    public Q15Weight(double pounds){
        this.pounds = pounds;
    }

    public double getPounds(){
        return pounds;
    }

    public double getKilograms() {
        return pounds * POUNDS_TO_KG;
    }
}
