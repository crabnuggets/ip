import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duke {
    private static final String horizontalLine = "____________________________________________________________\n";

    public static void main(String[] args) {

        String logo = " ______    _   __   __            \n" +
                "|_   _ \\  (_) [  | [  |           \n" +
                "  | |_) | __   | |  | |   _   __  \n" +
                "  |  __'.[  |  | |  | |  [ \\ [  ] \n" +
                " _| |__) || |  | |  | |   \\ '/ /  \n" +
                "|_______/[___][___][___][\\_:  /   \n" +
                "                         \\__.'    \n";

        String greetingMessage = horizontalLine +
                " Hello! I'm Billy\n" +
                " What can I do for you?\n" +
                horizontalLine;
        String goodbyeMessage = horizontalLine +
                " Bye. Hope to see you again soon!\n" +
                horizontalLine;

        boolean programIsRunning = true;
        String userInput;
        List<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Hello from\n" + logo + greetingMessage);

        while (programIsRunning) {
            userInput = in.nextLine().trim();

            if (userInput.toLowerCase().equals("bye")) {
                System.out.println(goodbyeMessage);
                programIsRunning = false;
            } else if (userInput.toLowerCase().equals("list")) {
                printList(list);
            } else {
                list.add(userInput);
                System.out.println(horizontalLine + "added: " + userInput + "\n" + horizontalLine);
            }
        }

    }

    public static void printList(List<String> list) {
        System.out.println(horizontalLine);
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ": " + list.get(i));
        }
        System.out.println(horizontalLine);
    }
}
