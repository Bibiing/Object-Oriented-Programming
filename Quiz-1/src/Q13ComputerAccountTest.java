public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        Q13ComputerAccount account = new Q13ComputerAccount("Julian", "Bibing", "Haha123");

        account.printRealName();
        account.printUserName();
        account.printPassword();

        account.changePassword("Hihi321");
        account.printPassword();
    }
}
