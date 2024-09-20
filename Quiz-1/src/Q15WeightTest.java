public class Q15WeightTest {
    /**
     * This class tests the Q15Weight class.
     * It creates instances of Q15Weight and tests the methods for returning the weight in pounds and kilograms.
     */
    public static void main(String[] args) {
        // Test case 1: Weight of 150 pounds
        Q15Weight test1 = new Q15Weight(150);
        System.out.println("Weight in pounds: " + test1.getPounds());
        System.out.println("Weight in kilograms: " + test1.getKilograms());

        // Test case 2: Weight of 200 pounds
        Q15Weight weight2 = new Q15Weight(200);
        System.out.println("Weight in pounds: " + weight2.getPounds());
        System.out.println("Weight in kilograms: " + weight2.getKilograms());

        // Test case 3: Weight of 100.5 pounds
        Q15Weight weight3 = new Q15Weight(100.5);
        System.out.println("Weight in pounds: " + weight3.getPounds());
        System.out.println("Weight in kilograms: " + weight3.getKilograms());
    }
}
