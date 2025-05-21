import java.util.Scanner;

public class GratestBetweenThree {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter one no");
        int var2 = var1.nextInt();
        System.out.print("enter another no");
        int var3 = var1.nextInt();
        System.out.print("enter another no");
        int var4 = var1.nextInt();
        System.out.print("enter another no");
        int var5 = var1.nextInt();
        if (var2 > var3 && var2 > var4 && var2 > var5) {
            System.out.println("first no is gratest" + var2);
        } else if (var3 > var2 && var3 > var4 && var3 > var5) {
            System.out.println("second no is gratest" + var3);
        } else if (var4 > var2 && var4 > var3 && var4 > var5) {
            System.out.println("third no is gratest" + var4);
        } else {
            System.out.println("four no is gratest" + var5);
        }

    }
}



