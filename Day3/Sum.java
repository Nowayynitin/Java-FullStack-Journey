import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now please enter your second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.print("Sum of your Numbers is: " + sum);
    }
}
