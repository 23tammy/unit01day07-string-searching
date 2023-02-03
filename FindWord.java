// BUG: the 3rd example (searching for "d" caused this to happen:)
/* Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end -1, length 26
        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
        at java.base/java.lang.String.substring(String.java:1874)
        at FindWord.main(FindWord.java:16) */
import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("INSERT SENTENCE:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        System.out.println("INSERT LETTER:");
        String letter = scanner.nextLine();

        int letteri = sentence.indexOf(letter);

        if (letteri != -1){
            int afterword = sentence.indexOf(" ", letteri);
            String sentBeforeLet = sentence.substring(0, afterword);
            int beforeword = sentBeforeLet.lastIndexOf(" ");

            System.out.print(sentBeforeLet.substring(beforeword+1, afterword));
        }else{
            System.out.println("NO TAG FOUND.");
            
        }
        scanner.close();

    }
}