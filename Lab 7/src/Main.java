import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();


        //TASK 1
        names.put("matt", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.println(names.get("mikael"));

        //task 2
        PromissoryNote mattisNote = new PromissoryNote();

        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Arto", 11.5);

        System.out.println(mattisNote.howMuchIsDebt("Arto"));
        System.out.println(mattisNote.howMuchIsDebt("Joel"));

        //task 3

        Dictionary dictionary1 = new Dictionary();
        dictionary1.add("apina", "monkey");
        dictionary1.add("banaani", "banana");
        dictionary1.add("cembalo", "harpsichord");

        System.out.println(dictionary1.translate("apina"));
        System.out.println(dictionary1.translate("porkkana"));

        System.out.println(dictionary1.amountOfWords());

        ArrayList<String> translations = dictionary1.translationList();

        for(String translation: translations){
            System.out.println(translation);
        }

        String input = "translate\n" + "monkey\n"  +
                "translate\n" + "cheese\n" +
                "add\n"  + "cheese\n" + "juusto\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();





    }
}