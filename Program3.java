import java.util.Scanner;

public class Program3 {

    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = n.nextInt();
        int flag = 0;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
