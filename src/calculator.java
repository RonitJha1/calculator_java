import java.util.*;
public class calculator {
    public static void main(String[]args){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter first no:");
            int a=user.nextInt();
        System.out.print("Enter second no:");
        int b=user.nextInt();
        System.out.println("Enter 1 to add:");
        System.out.println("Enter 2 to subtract:");
        System.out.println("Enter 3 to multiply:");
        System.out.println("Enter 4 to divide:");
        System.out.println("Enter 5 to module:");
        System.out.println("Enter 6 to find odd or even:");
        System.out.print("Enter your choice (1-6): ");
        int choice = user.nextInt();
        switch (choice){
           case 1:
               System.out.println("Add value:"+(a+b));
               break;
           case 2:
               System.out.println("subtract value:"+(a-b));
               break;
           case 3:
               System.out.println("multiply value:"+(a*b));
               break;
           case 4:
               System.out.println("divide value:"+(a/b));
               break;
           case 5:
               System.out.println("module value:"+(a%b));
               break;

           case 6:
               int find = a % 2;
               switch (find) {
                   case 0:
                       System.out.println(a + " is Even.");
                       break;
                   case 1:
                       System.out.println(a + " is Odd.");
                       break;
               }

           default:
               System.out.println("error value");

       }
       }
    }