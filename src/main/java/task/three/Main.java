package task.three;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private final static KanyeService ks = new KanyeService();


    public static void main(String[] args) {
        Scanner scanner;
        Set<String> quotes = new HashSet<>();

        while (true) {
            scanner = new Scanner(System.in);
            String kanyeWestQuotes = " ";
            try {
                kanyeWestQuotes = getQuot();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!quotes.contains(kanyeWestQuotes) && !" ".equalsIgnoreCase(kanyeWestQuotes)){
                System.out.println(kanyeWestQuotes);
                quotes.add(kanyeWestQuotes);
                System.out.print("Type 'next' to se the next one: ");
                String input = scanner.next();
                if (!"next".equalsIgnoreCase(input))
                    break;
            }
        }
    }

    private static String getQuot() throws URISyntaxException, IOException, InterruptedException {
        return ks.quot();
    }
}