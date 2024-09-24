public class Q13ComputerAccount {

    private String realName;
    private String userName;
    private String password;

    /**
     * Constructor for Q13ComputerAccount.
     * Initializes the realName, userName, and password.
     */

    public Q13ComputerAccount(String realName, String userName, String password){
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    // print real name of the user
    public void printRealName() {
        System.out.println("Real Name\t:" + realName);
    }

    // print real name of the user
    public void printUserName() {
        System.out.println("Username\t:" + userName);
    }

    // print real name of the user
    public void printPassword() {
        System.out.println("Password\t:" + password);
    }

    public void changePassword(String newPass){
        this.password = newPass;
        System.out.println("Password changed successfully");
    }
}
