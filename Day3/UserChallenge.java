import java.util.Scanner;

public class UserChallenge{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name:");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to IntelliJ");
    }
}