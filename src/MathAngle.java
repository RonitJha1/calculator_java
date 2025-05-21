import java.util.Scanner;
  public class MathAngle {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter number to find area of rectangle");
        System.out.print("Enter length:");
        int var2 = var1.nextInt();
        System.out.print("Enter your breath:");
        int var3 = var1.nextInt();
        int var4 = var2 * var3;
        System.out.println("your area is:" + var4);
        System.out.println("Now enter number to find area of triangle:");
        System.out.print("Enter base of triangle:");
        int var5 = var1.nextInt();
        System.out.print("Enter height of triangle:");
        int var6 = var1.nextInt();
        int var7 = var5 * var6 / 2;
        System.out.println("Area of triangle is:" + var7);
        System.out.println("now the area of square:");
        System.out.print("enter the no to print area of square:");
        int var8 = var1.nextInt();
        int var9 = var8 * var8;
        System.out.println("Area of square is:" + var9);
        System.out.print("Enter any number to multiply:");
        int var10 = var1.nextInt();
        int var11 = var10 * 1;
        int var12 = var10 * 2;
        int var13 = var10 * 3;
        int var14 = var10 * 4;
        int var15 = var10 * 5;
        int var16 = var10 * 6;
        int var17 = var10 * 7;
        int var18 = var10 * 8;
        int var19 = var10 * 9;
        int var20 = var10 * 10;
        System.out.println("one=" + var11);
        System.out.println("two=" + var12);
        System.out.println("three=" + var13);
        System.out.println("four=" + var14);
        System.out.println("five=" + var15);
        System.out.println("six=" + var16);
        System.out.println("sevev=" + var17);
        System.out.println("eight=" + var18);
        System.out.println("nine=" + var19);
        System.out.println("ten=" + var20);
    }
}

