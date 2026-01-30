/**
 * Name: TestGenericStack.java
 * Purpose: Test the GenericStack class.
 * Programmer: Alex Kurcan
 * Date: 01/29/2026
 */



import java.util.Scanner;

/**
 * TestGenericStack - Class
 * 
 * This class tests the GenericStack class.
 * 
 * It asks the user to enter five strings and stores
 * them in a stack. The program then removes and
 * displays each string from the stack, showing them
 * in reverse order of how they were entered.
 */
public class TestGenericStack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            stack.push(input.nextLine());
        }

        System.out.println("\nStrings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
