import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class userInput {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter something: ");
            String userInput = input.nextLine();

            if(StringUtils.isNumeric(userInput)){
                System.out.println(userInput + " is a number.");
            } else {
                System.out.println(userInput + " is not a number.");
            }
            userInput = StringUtils.swapCase(userInput);
            System.out.println("Flipping the case: " + userInput);

            userInput = StringUtils.reverse(userInput);
            System.out.println("Reversed: " + userInput);
        }
}
