import java.util.Scanner;
public class CLIgreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hi " +name+ "!");
        if (age % 2 == 0) {
            System.out.println("Your age is even.");
        } else {
            System.out.println("Your age is odd.");
        }

    }
}
