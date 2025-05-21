import java.util.*;
public class practice {
    public static void main(String[] args){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter the first no:");
        int a=user.nextInt();
        System.out.print("Enter the second no:");
        int b=user.nextInt();
        System.out.println("Enter 1 to add:");
        System.out.println("Enter 2 to subtract:");
        System.out.println("Enter 3 to module:");
        System.out.println("Enter 4 to divide:");
        System.out.println("Enter 5 to multiply:");
        System.out.println("Enter 6 to odd or even:");
        int choice= user.nextInt();
        switch (choice){
            case 1:
                System.out.println("your value is:"+(a+b));
                break;
            case 2:
                System.out.println("your value is:"+(a-b));
                break;
            case 3:
                System.out.println("your value is:"+(a%b));
                break;
            case 4:
                System.out.println("your value is:"+(a/b));
                break;
            case 5:
                System.out.println("your value is:"+(a*b));
                break;
            case 6:
                int find =a%2;
                switch(find){
                    case 0:
                        System.out.println("it is even:");
                        break;
                    case 1:
                        System.out.println("it is odd:");
                        break;

                }
            default:
                System.out.println("your enter wrong value");
        }

    }
}
