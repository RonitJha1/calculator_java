import java.util.Scanner;

public class VerificationProject {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter your username;");
        String var2 = var1.nextLine();
        System.out.print("Emter your password:");
        int var3 = var1.nextInt();
        if (var2 != "admin" && var3 != 12345) {
            System.out.println("your password is incorrect ");
        } else {
            System.out.println("Your password is correct");
        }

    }
}
