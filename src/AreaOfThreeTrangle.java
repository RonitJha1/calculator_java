import java.util.Scanner;

public class AreaOfThreeTrangle {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter length:");
        float var2 = var1.nextFloat();
        System.out.print("Enter breath:");
        float var3 = var1.nextFloat();
        System.out.print("Enter base");
        float var4 = var1.nextFloat();
        System.out.print("Enter height");
        float var5 = var1.nextFloat();
        System.out.print("Enter area");
        float var6 = var1.nextFloat();
        float var7 = var2 * var3;
        float var8 = var4 * var5 / 2.0F;
        float var9 = var6 * var6;
        System.out.println("Area of rectangle is:" + var7);
        System.out.println("Area of trangle is:" + var8);
        System.out.println("Area of square is:" + var9);
    }
}

