import java.util.Scanner;

public class CounterMain {

    public static void main(String[] args) {

        WordCounter counter = new WordCounter();
        Scanner scan = new Scanner(System.in);
        Boolean value = false;
        System.out.println("Please write a text:");
        while (!value) {
            String text = scan.nextLine();
            counter.containsStop(text);
            counter.getNumberCharacter(text);
            counter.getNumberRad(text);

            if (text.contains("stop")
            ) {
                value = true;
            }
        }
    }
}

