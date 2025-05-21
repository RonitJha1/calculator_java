import java.util.Scanner;
public class VoteSystem {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter your age:");
        int var2 = var1.nextInt();
        System.out.print("Enter your brother age:");
        int var3 = var1.nextInt();
        if (var2 >= 18 && var3 >= 18) {
            System.out.println("You both are eligible for vote");
        } else if (var2 >= 18 && var3 <= 18) {
            System.out.println("You are eligible for vote but brother is not eligible for vote ");
        } else if (var2 <= 18 && var3 >= 18) {
            System.out.println("Your brother is eligible for  vote but you are not eligible for vote");
        } else {
            System.out.println("Your both are not eligible for vote");
        }

    }
}
