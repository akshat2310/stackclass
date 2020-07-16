import java.util.Stack;
import java.util.Iterator;

public class StackExample {
    public static void main(String[] argv) {
        Stack<String> stackOfCards = new Stack<String>();

        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();
        String cardAtTop = stackOfCards.pop();
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        System.out.println("Is Stack empty? : " + stackOfCards.isEmpty());

        // Find the size of Stack
        System.out.println("Size of Stack : " + stackOfCards.size());

        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
        int position = stackOfCards.search("Queen");

        if(position != -1) {
            System.out.println("Found the element \"Queen\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}