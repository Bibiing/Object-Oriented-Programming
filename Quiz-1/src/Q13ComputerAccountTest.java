public class Q13ComputerAccountTest {

    /**
     * This class tests the Q13ComputerAccount class.
     * It creates instances of Q13ComputerAccount and tests all the methods, including
     * printing details and changing the password.
     */

    public static void main(String[] args) {
        Q13ComputerAccount account = new Q13ComputerAccount("Julian", "Bibing", "Haha123");

        account.printRealName();
        account.printUserName();
        account.printPassword();

        account.changePassword("Hihi321");
        account.printPassword();
    }
}
