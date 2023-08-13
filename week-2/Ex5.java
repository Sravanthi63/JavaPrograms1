import java.util.Scanner;
class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the boolean value (true/false): ");
        boolean boolValue = input.nextBoolean();
        System.out.println("The opposite value of the boolean variable is: " + !boolValue);
    }
}